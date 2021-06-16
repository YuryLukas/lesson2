public class Menu {
    private Handler handler = new Handler();
    private int valueKey;

    public void show() {
        handler.setString("Ваши действия?");
        handler.println();
        handler.printnRepeatLn("-", 50);
        handler.setString("0 - выход; 1 - Ввести данные; 2 - Вывести все значения");
        handler.println();

    }

    public Boolean handlerMenu(){
        
        handler.read();
        this.valueKey = handler.getInteger();

        switch(valueKey){
            case 0: return false;
                    
            case 1: return true;
                    
            case 2:  return true;
        }
		return true;
    }

    public int getKey() {
        return this.valueKey;
    }
}
