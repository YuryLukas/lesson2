import java.util.List;

public class ShowPersonList extends ShowList{
    private Handler handler = new Handler();

    ShowPersonList(){
        super();
    }
    
    @Override
    public void printList( List<Person> personCollection) {
        
        handler.printnRepeatLn("-", 50);
        for(Person item: personCollection){
            handler.setString("Имя: " + item.getName());
            handler.println();
            handler.setString("Фамилия: " + item.getSurname());
            handler.println();
            handler.printnRepeatLn("-", 50);
        }
        
    }
}
