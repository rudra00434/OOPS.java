package Collection2;


public class Customer {

   private String cid;
   private String cname;
   private String cphno;
   public Customer(String cid,String cname,String cphno)
   {
	   super();
	   this.cid=cid;
	   this.cname=cname;
	   this.cphno=cphno;
	   
   }
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCphno() {
	return cphno;
}
public void setCphno(String cphno) {
	this.cphno = cphno;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", cphno=" + cphno + "]";
}
   


}
