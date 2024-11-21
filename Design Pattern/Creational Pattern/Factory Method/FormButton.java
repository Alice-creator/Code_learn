public class FormButton implements Button {
    public void render(){
        System.out.println("Rendering HTML button");
    }

    public void onClick(String messString){
        System.out.println(messString + " From button");
    }
}
