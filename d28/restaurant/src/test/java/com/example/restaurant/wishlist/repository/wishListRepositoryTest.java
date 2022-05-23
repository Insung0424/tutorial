package com.example.restaurant.wishlist.repository;

import com.example.restaurant.wishlist.entity.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class wishListRepositoryTest {

    @Autowired
    private WishLIstRepository wishLIstRepository;

    private WishListEntity create(){
        var wishList = new WishListEntity();
        wishList.setTitle("title");
        wishList.setCategory("category");
        wishList.setAddress("address");
        wishList.setReadAddress("readAddress");
        wishList.setHomePageLink("");
        wishList.setImageLink("");
        wishList.setVisit(false);
        wishList.setVisitCount(0);
        wishList.setLastVisitDate(null);

        return wishList;
    }


    @Test
    public void saveTest(){ //데이터 저장 되는 지 테스트
        var wishListEntity = create();
        var expected= wishLIstRepository.save(wishListEntity);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getIndex());
    }

    @Test
    public void updateTest(){ //db에 데이터가 있는 경우 update함
        var wishListEntity = create();
        var expected= wishLIstRepository.save(wishListEntity); //원래있던 1번째를 찾아옴

        expected.setTitle("update test"); //타이틀 변경
        var saveEntity= wishLIstRepository.save(expected); //저장한뒤 다시 호출

        Assertions.assertEquals("update test",saveEntity.getTitle()); //원래 있던것을 불러옴
        Assertions.assertEquals(1, wishLIstRepository.listAll().size()); // 그러므로 숫자는 변경되지않음 1유지
    }

    @Test
    public void findByIdTest(){ //특정한 아이디를 가지고 데이터 찾기
        var wishListEntity = create();
        wishLIstRepository.save(wishListEntity); //데이터를 만들고 저장함

        var expected = wishLIstRepository.findById(1); // 그데이터를 찾아옴
        Assertions.assertEquals(true, expected.isPresent()); //데이터가 존재하는가
        Assertions.assertEquals(1, expected.get().getIndex()); //예상 있으면 1
    }

    @Test
    public void deleteTest(){ //삭제
        var wishListEntity = create();
        wishLIstRepository.save(wishListEntity); //데이터를 만들고 저장함

        wishLIstRepository.deleteById(1); // 그 데이터를 삭제함
        int count = wishLIstRepository.listAll().size(); // 그래서 크기는 0
        Assertions.assertEquals(0,count); // 예상은 0

    }

    @Test
    public void ListAllTest(){ //전체 리스트 가져오기기
        var wishListEntity1 = create();
        wishLIstRepository.save(wishListEntity1); //데이터를 만들고 저장함

        var wishListEntity2 = create();
        wishLIstRepository.save(wishListEntity2); //데이터를 만들고 저장함

        int count = wishLIstRepository.listAll().size(); // 그래서 크기는 0,1 합해서 2
        Assertions.assertEquals(2,count); // 예상은 2
    }

}
