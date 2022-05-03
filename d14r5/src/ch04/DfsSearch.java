package ch04;

import java.util.Stack;

public class DfsSearch {

		int count; // 크기,갯수
		boolean[] visited; // 확인
		Stack<Integer> stack; // 
		int[][] matrix; // 2차원 배열
		
		// DfsSearch생성자(수) 확인 및 stack방식
		public DfsSearch(int count) {
			this.count = count;
			visited = new boolean[count];
			stack = new Stack<Integer>();
		}
		//stack을 사용한 반복문 
		public void dfsTraversal() {
			stack.push(0);
			visited[0] = true; //조건 설정
			while(stack.isEmpty() == false) { //반복문 변수에 스택활용
				int node = stack.pop(); // 변수 추가 스택 사용
				System.out.print(node + " ");  //결과물 출력
				for( int j = 0; j<count; j++) { // 반복문
					if(matrix[node][j] != 0 && !visited[j]) { //if 매트릭스와 조건문 결합
						stack.push(j);  //스택
						visited[j] = true;   //조건 확인
					}
				}
			}
		}
		
	public static void main(String[] args) {
		
			int count = 8;
			UndirectedGraph graph = new UndirectedGraph(count);
			graph.addEdge(0, 1, 1);
			graph.addEdge(0, 2, 1);
			graph.addEdge(1, 3, 1);
			graph.addEdge(1, 4, 1);
			graph.addEdge(3, 7, 1);
			graph.addEdge(4, 5, 1);
			graph.addEdge(2, 5, 1);
			graph.addEdge(2, 6, 1);
			
			DfsSearch dfs = new DfsSearch(count);
			dfs.matrix = graph.getMatrix();
			
			dfs.dfsTraversal();
	}

}
