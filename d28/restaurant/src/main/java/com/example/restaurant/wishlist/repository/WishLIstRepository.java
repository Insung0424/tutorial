package com.example.restaurant.wishlist.repository;

import com.example.restaurant.db.MemoryDbEntity;
import com.example.restaurant.db.MemoryDbRepositoryAbstract;
import com.example.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;



@Repository //db 를 저장하는 곳이라는 걸 알려주는 어노테이션
public class WishLIstRepository extends MemoryDbRepositoryAbstract<WishListEntity> {


}
