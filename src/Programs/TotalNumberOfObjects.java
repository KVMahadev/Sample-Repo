package Programs;



public class TotalNumberOfObjects {
	
	 int objectCount = 0;

	    public TotalNumberOfObjects() {
	        objectCount++;
	    }

	    public static void main(String[] args) {
	        TotalNumberOfObjects to = new TotalNumberOfObjects();
	        TotalNumberOfObjects to1 = new TotalNumberOfObjects();
	        TotalNumberOfObjects to2 = new TotalNumberOfObjects();
	        TotalNumberOfObjects to3 = new TotalNumberOfObjects();
	        TotalNumberOfObjects to4 = new TotalNumberOfObjects();

	        System.out.println("Total number of objects created: " + to4.objectCount);
	    }
}
