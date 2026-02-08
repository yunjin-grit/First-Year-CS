//컴퓨터학과 20250492 이윤진
public class Plane {
	private int id;
	private String model;
	private int capacity;
	private static int planes = 0;	
	
	public String toString(){
        String rslt ="";
        rslt += "식별번호: " + id +"편\n";
        rslt += "모델: " + model + "\n";
        rslt += "승객수: " + capacity + "명";
        
        return rslt;
    }
	
	public void setId(int id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public static int getPlanes() {
		return planes;
	}
	
	
	public Plane() {
		id = 0;
		model = "모름";
		capacity = 0;
		planes++;
	}
	
	public Plane(int id, String model, int capacity) {
		setId(id);
		setModel(model);
		setCapacity(capacity);
		planes++;
	}
}
