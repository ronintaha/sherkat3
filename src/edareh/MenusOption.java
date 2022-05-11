//package edareh.service;

//public class MenusOption {
//    static String name1;
//    static String lastname;
//    static String age;
//    static String id;
//    static int num;
//   public static void personelInput() throws InterruptedException {
//
//       System.out.println("please enter your information");
//       Scanner scanner = new Scanner(System.in);
//
//       System.out.println("your name?");
//       name1 = scanner.next();
//       System.out.println("your lastname?");
//       lastname = scanner.next();
//       System.out.println("your age?");
//       age = scanner.next();
//       System.out.println("your ID?");
//       id = scanner.next();
//       System.out.println("your information :");
//
//
//       PersonelData personelData = new PersonelData();
//       personelData.setName(name1);
//       personelData.setLasteName(lastname);
//       personelData.setAge(age);
//       personelData.setId(id);
//       System.out.println(personelData.getName() + "\t" + personelData.getLasteName() + "\t" + personelData.getAge() + "\t" + personelData.getId());
//
//
//       try {
//
//           PersonnelCRUD personnelCRUD = new PersonnelCRUD();
//           personnelCRUD.create(personelData);
//       }catch (Exception e){
//           System.out.println("didnt saved at table");
//       }
//
//       DataBase db = new DataBase();
//       db.insertClient(personelData,personelData.getId());
//
//
//       System.out.println("if you want to continue press '0' :");
//
//       int cunt = scanner.nextInt();
//       if (cunt == 0) {
//           System.out.println("processing...");
//           Thread.sleep(500);
//           System.out.println("Saved!");
//
//       }
//   }

//    public static void search(){
//       Scanner scanner1 = new Scanner(System.in);
//        System.out.println("please enter the ID of person you want :");
//        String id = scanner1.next();
//        System.out.println(Search.getPersonByID(id).getName()+" is here!");
//    }
//    public static void leaveRequestInput() throws InterruptedException {
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("please enter your lastname to login :");
//        String name = scanner2.next();
//        System.out.println("welcome "+Search.getPersonByLastname(name).getName());
//        System.out.println("now please enter the day you want to leave :");
//         num = scanner2.nextInt();
//        VacationData leave = new VacationData(num);
//        System.out.println("you want to leave in "+leave.getDayOfLeave()+" om");
//        System.out.println("if you want to save press '0'");
//        int vrod = scanner2.nextInt();
//        if (vrod==0){
//            System.out.println("processing...");
//            Thread.sleep(1000);
//            System.out.println("saved");
//        }
//
//
//    }
//    public static void leaveAccept(){
//       Scanner scanner3 = new Scanner(System.in);
//        System.out.println("please enter your manager id: (its: 1234) ");
//        int mId =scanner3.nextInt();
//        if (mId==1234){
//            System.out.println("welcome manager: \n\n");
//        }else {
//            System.out.println("Wrong manager id!");
//            try {
//                menu();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("enter '0' for check leave requests: ");
//        int i0 = scanner3.nextInt();
//        if (i0==0){
//            PersonelData personelData = new PersonelData();
//            VacationData leave = new VacationData();
//
//            System.out.println(personelData.getName()+" wants to leave "+"in "+leave.getDayOfLeave()+" om");
//        }else{
//            System.out.println("Out of range!");
//            try {
//                menu();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("if you want to confirm press '0' if you dont press '1':");
//        int v00= scanner3.nextInt();
//        if (v00==0){
//            System.out.println("ok saved");
//        }else {
//            System.out.println("dont confirmed");
//        }
//    }
//}
//