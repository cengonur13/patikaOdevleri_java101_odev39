public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYears;

    public Employee(String name, double salary, int workHours, int hireYears){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        if(2021 < hireYears){
            // burda nesneye erişim yasagı da eklenebilirdi...
            System.out.println("Yanlış İşe Giriş Tarihi!");
        }else {
            this.hireYears = hireYears;
        }
    }

    public double tax(){
        if(salary>= 0 && salary < 1000){
            return 0;
        }else if (salary >= 1000){
            return salary * 0.03;
        }else{
            System.out.println("Maaş bilgisi yanlış girildiğinden, vergi hesaplanamadı!");
            return 0;
        }
    }

    public double bonus(){
        if (workHours >= 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }
    // the current date is assumed to be 2021...
    public double raiseSalary(){
        if((2021 - this.hireYears) >= 0 && (2021 - this.hireYears) < 10){
            return this.salary * 0.05;
        }else if ((2021 - this.hireYears) >= 10 && (2021 - this.hireYears) < 19){
            return this.salary * 0.1;
        }else if(2021 - this.hireYears >= 19){
            return this.salary * 0.15;
        }else {
            System.out.println("İşe giriş tarihi hatalı!");
            return 0;
        }
    }

    public void printEmployeeInfo(){
        System.out.println("=======Çalışan Bilgileri=====");
        System.out.println("Çalışan Ad ve Soyad \t\t\t\t: "+this.name);
        System.out.println("Çalışan Maaşı \t\t\t\t\t\t: "+this.salary);
        System.out.println("Haftalık Çalışma Saati \t\t\t\t: "+this.workHours);
        System.out.println("Başlangıç Yılı \t\t\t\t\t\t: "+this.hireYears);
        System.out.println("Vergi \t\t\t\t\t\t\t\t: "+this.tax());
        System.out.println("Bonus \t\t\t\t\t\t\t\t: "+this.bonus());
        System.out.println("Maaş Artışı \t\t\t\t\t\t: "+this.raiseSalary());
        System.out.println("Vergi ve Bonus ile Birlikte Maaş \t: "
                +(this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam Maaş \t\t\t\t\t\t: "
                +(this.raiseSalary() + this.salary)); // burası eksik

    }

}
