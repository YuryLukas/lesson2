import java.util.Scanner;

class Handler{

    private String tmpString;
    private Scanner scanner;

    Handler(){
        
    }

    public void read() {
        scanner = new Scanner(System.in);
        this.tmpString = scanner.nextLine();
    }

    public void print() {
        System.out.print(this.tmpString);
    }

    public void println() {
        System.out.println(this.tmpString);
    }

    public void printnRepeatLn(String sample, int counter) {
        String tmp="";
        int i;
        for(i=0; i < counter; i++){
            tmp += sample;
        }
        System.out.println(tmp);
    }

    public void setString(String tempString) {
        this.tmpString = tempString;
    }

    public String getString() {
        return this.tmpString;
    }

    public int getInteger(){
        try{
            return Integer.parseInt(this.tmpString.trim());
        } 
        catch(Exception e)
        {
            System.out.println("Ошибка конвертации данных? Повторите и будьте внимательны при вводе.");
            this.printnRepeatLn("-", 50);
            return 0;
        }
    }

}