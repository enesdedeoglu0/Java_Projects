// ENES DEDEOĞLU 6.04.2023

public class Course {
    Teacher courseTeacher;
    String name;
    int credit;
    double note;
    double verbalnote;
    Student course;
    public Course mat,kimya,fizik;

    public Course(String name, String credit){
        this.name=name;
        this.credit=0;
        this.note=0;
        this.verbalnote=0;
    }
    public void addteacher(Teacher A){
        if(this.name.equals(A.branch)){
            this.courseTeacher=A;
            System.out.println("OGRETMEN BASARILI BIR SEKILDE SECILDI. ");
        } else{
            System.out.println("BU DERS BU OGRETMEN TARAFINDAN VERILEMEZ. ");
        }
    }

}