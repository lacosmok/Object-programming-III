package arts;

public class Drawing extends Art {
Drawing(){
	System.out.println("Drawing class construcrtor");
}
Drawing(String painter){
	super(painter);
	System.out.println("Drawing painter: "+ painter);
}
}
