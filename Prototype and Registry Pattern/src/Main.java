
public class Main {
    public static void main(String[] args) {
        Registry register = new Registry();
        fillRegisrty(register);
        Student s = register.get("jul22").clone();
        s.setName("Raj");
        s.setAge(28);
        s.setPsp(85);

        Student s1 = register.get("jun23").clone();

        s1.setName("Ajay");
        s1.setPsp(80);
        s1.setAge(22);

        System.out.println(s1.toString());
        System.out.println(s.toString());
        }

        public static void fillRegisrty(Registry registry)
        {
            Student jul22 = new Student();
            jul22.setBatch("July 22");
            jul22.setAvg_psp(75);

            registry.set("jul22", jul22);

            IntillengentStudent jun23 = new IntillengentStudent();

            jun23.setAvg_psp(85);
            jun23.setIq(150);
            jun23.setBatch("Jun 23");

            registry.set("jun23", jun23);

        }
    }
