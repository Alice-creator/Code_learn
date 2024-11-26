public abstract class Dialog{
    public Dialog(){

    };

    public abstract Button createButton();

    public void render(){
        final Button okButton = createButton();
        okButton.onClick("Close dialog");
    }
}