public class Employee {
    // sınıfımızın nitelikleri
    String name;
    int salary;
    int workHours;
    int hireYear;


    // Employee constructor tanımlandı.
    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // vergi metodumuzu oluşturalım.
    double tax() {
        double tax = 0;
        if (this.salary >= 1000) {
            tax = this.salary * 0.03;
        } else {
            System.out.println("Vergi uygulanmayacaktır.");
        }

        return tax; // vergi değerini hesapladıktan sonra geri döndürelim

    }

    double bonus() {
        int appliedBonus = 0;
        // Çalışma saatine göre koşulu belirleyelim.
        if (workHours > 40) {
            for (int i = 41; i <= workHours; i++) {
                appliedBonus += 30;
                //System.out.println("Bonus : " + appliedBonus);
            }
        } else {
            System.out.println("Ekstra çalışma saatiniz yok.");
        }

        return appliedBonus; // Çalışma bonus değerini geri döndürelim.

    }

    double raiseSalary() {
        double extraSalary;
        // Maaş artışına göre olan koşulu yerine getirelim.
        if (hireYear > 2011) {
            extraSalary = this.salary * 0.05;
            //newSalary = salary + extraSalary;
           // System.out.println("Maaş artışı : " + extraSalary);
            //System.out.println("Yeni maaş : " + newSalary);
        } else if (hireYear < 2000) {
             extraSalary = this.salary * 0.15;
           // newSalary = salary + extraSalary;
           // System.out.println("Maaş artışı : " + extraSalary);
            //System.out.println("Yeni maaş : " + newSalary);
        } else {
             extraSalary = this.salary * 0.1;
            // newSalary = salary + extraSalary;
           // System.out.println("Maaş artışı : " + extraSalary);
            //System.out.println("Yeni maaş : " + newSalary);
        }

        return extraSalary; // Maaş artışını alıp kullanıcıya geri döndürelim.

    }

    @Override
    public String toString() {      // toString metoduyla kullandıklarımıza stringe çevirelim

        double tax = tax();         // tax metodu tax değerine çevirilirken
        double bonus = bonus();     // bonus metodu bonus değerine çevirilirken
        double raiseSalary = raiseSalary();     // raiseSalary metodu raiseSalary değerine çevirilirken
        double taxAndBonusSalary = this.salary - tax + bonus;       // verg metodu tax değerine çevirilirken

        double totalSalary = this.salary - tax + bonus + raiseSalary;

        // Ekrana değeri yazdıralım


        return  "    Adı : " + this.name +
                "\n Maaşı :  " + this.salary +
                "\n Çalışma saati :" + this.workHours +
                "\n Başlangıç yılı :" + this.hireYear +
                "\n Vergi : " + tax +
                "\n Bonus : " + bonus +
                "\n Maaş artışı : " + raiseSalary +
                "\n Vergi ve bonuslar ile birlikte maaş : " + taxAndBonusSalary +
                "\n Toplam maaş : " + totalSalary;

    }

}
