package Cdp008;

/**
  ��Ʒ��������������Ʒ����ģ���Ʒ�����������洢����Ʒ����Ϣ��
*/
public class Commodity{
	private long no;
	private String name;
	private int price;

	
	public Commodity(long no,String name,int price){
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public void setNo(long no){
		this.no = no;
	}
	public long getNo(){
		return this.no;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return this.price;
	}

	public String toString(){
		return "Student[no:"+this.no+",name:"+this.name+",price:"+this.price+"]";
	}
}