
public class Main {
    public static void main(String[] args) {

    Teacher t1 = new Teacher("Mahmut hoca", "TRH","555" );
    Teacher t2 = new Teacher("Graham bell", "FZK", "000");
    Teacher t3 = new Teacher("Külyutmaz", "BIO", "111");


    Course tarih = new Course("Tarih", "101", "TRH");
    Course tarihQuiz = new Course("Tarih", "101", "TRH");
    tarih.addTeacher(t1);

    Course fizik = new Course("Fizik", "102", "FZK");
    Course fizikQuiz = new Course("Fizik", "102", "FZK");
    fizik.addTeacher(t2);

    Course biyo = new Course("Biyoloji", "101", "BIO");
    Course biyoQuiz = new Course("Biyoloji", "101", "BIO");
    biyo.addTeacher(t3);




    Student s1 = new Student("İnek şaban", "123", "4", tarih,fizik,biyo,tarihQuiz,fizikQuiz,biyoQuiz);

    s1.addBulkExamNote(100,80,50, 40, 50,60);

    s1.isPass();

    Student s2 = new Student("Güdük necmi", "612", "4", tarih, fizik, biyo,tarihQuiz,fizikQuiz,biyoQuiz);

    s2.addBulkExamNote(50,30,80, 30, 50, 50);
    s2.isPass();










    }
}