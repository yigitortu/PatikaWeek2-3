public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course q1;
    Course q2;
    Course q3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course q1, Course q2, Course q3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    // Sınav ve Quiz notlarını ekleyelim.
    void addBulkExamNote(int note1, int note2, int note3,int quiz1, int quiz2, int quiz3){
        if (note1 >= 0 && note1 <= 100 ) {
            this.c1.note = note1;
            this.q1.note = quiz1;
        }
        if (note2 >= 0 && note2 <= 100 ) {
            this.c2.note = note2;
            this.q2.note = quiz2;
        }
        if (note3 >= 0 && note3 <= 100 ) {
            this.c3.note = note3;
            this.q3.note = quiz3;
        }
    }






    void isPass(){
        System.out.println("*****************");
            // Sınav ve Quiz notlarına göre ortalama hesaplama.
        double c1Average = (this.c1.note * 0.8) + (this.q1.note * 0.2);
        double c2Average = (this.c2.note * 0.8) + (this.q2.note * 0.2);
        double c3Average = (this.c3.note * 0.8) + (this.q3.note * 0.2);

        this.avarage = c1Average + c2Average + c3Average / 3;


        if (this.avarage >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz.");
            this.isPass = true;
        }else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }

        printNote();

    }

    //Notları yazdıralım.
    void printNote(){

        System.out.println(c1.name + " Notu \t:" + c1.note);
        System.out.println(q1.name + " Quiz notunuz\t : " + q1.note );
        System.out.println(c2.name + " Notu \t:" + c2.note);
        System.out.println(q2.name + " Quiz notunuz\t : " + q2.note );
        System.out.println(c3.name + " Notu \t:" + c3.note);
        System.out.println(q3.name + " Quiz notunuz\t : " + q3.note );
        System.out.println("Ortalamanız : " + this.avarage);
    }



}
