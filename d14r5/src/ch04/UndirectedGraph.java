package ch04;

public class UndirectedGraph {
	
		private int count;  // 용량,크기,수
		private int[][] vertexMatrix;  //2차원배열
		//생성자(수)
		public UndirectedGraph(int count) {  
			this.count = count; 
			vertexMatrix = new int[count][count];
		}
		// 메서드(그래프를 만들기위한 변수3개)
		public void addEdge(int from,int to, int weight) {
			vertexMatrix[from][to] = weight;
			vertexMatrix[to][from] = weight;
		}
		//외부에서 배열을 사용하기 위한 get메서드 
		public int[][] getMatrix(){
			return vertexMatrix;
		}
}
