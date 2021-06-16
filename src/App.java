import java.util.ArrayList;
import java.util.List;

public class App {
    
    
    static void add(List<Person> personCollection) {
        int counter=0, i;
        Handler handler = new Handler();
        Person person;

        handler.printnRepeatLn("-", 50); 
        handler.setString("Какое количество персон будете описывать?");
        handler.println();
        handler.printnRepeatLn("-", 50); 
            
            while(counter==0){
                handler.read();
                counter = handler.getInteger();
            }

        handler.printnRepeatLn("-", 50);

        for(i=0;i<counter; i++){
            person = new Person();
            handler.setString("Имя: " );
            handler.print();
            handler.read();
            person.setName(handler.getString());
            handler.setString("Фамилия: ");
            handler.print();
            handler.read();
            person.setSurname(handler.getString());

            personCollection.add(person);
            handler.printnRepeatLn("-", 50); 
        }
        
    }
    public static void main(String[] args) throws Exception {
        Boolean flag=true;
        Menu menu = new Menu();
        ShowPersonList showMyList = new ShowPersonList();
        List<Person> personCollection = new ArrayList<Person>();

        while(flag){
            menu.show();
            flag = menu.handlerMenu();

            if( menu.getKey() == 1) {
                add(personCollection);
            }

            else if(menu.getKey()==2){
                showMyList.printList(personCollection);
            };

        };
        
    }


}
