import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyApplication {

    public static void main(String[] args) throws NullPointerException {
        List<Payable> people = new ArrayList<>();
            people.add(new Employee("John", "Lennon", "lawyer", 27045.78));
            people.add(new Employee("George", "Harrison", "teacher", 50000.00));
            people.add(new Student("Ringo", "Starr", 2.65));
            people.add(new Student("Paul", "McCartney", 4.0));

        Collections.sort(people, new Comparator<Payable>() {
            @Override
            public int compare(Payable p1, Payable p2) {
                try {
                    return Double.compare(p1.getPaymentAmount(), p2.getPaymentAmount());
                } catch (NullPointerException e) {
                    System.out.println("The problem is:"+e.getMessage());
                }

                return 0;
            }});

        printData(people);
    }


    public static void printData(Iterable<Payable> payables) {
        payables.forEach(payable -> {
            System.out.println(payable.toString() +  " earns " + payable.getPaymentAmount() + " tenge");
        });
    }
    }



