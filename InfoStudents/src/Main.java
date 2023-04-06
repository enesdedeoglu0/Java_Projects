// ENES DEDEOĞLU 6.04.2023

class main {
    public static void main(String[] args){
        Course mat=new Course("MATEMATIK ","5");
        Course kimya=new Course("KIMYA ", "4");
        Course fizik=new Course("FIZIK","4");

        Teacher merve=new Teacher("MERVE","MATEMATIK",5);
        Teacher ahmet=new Teacher("AHMET","BIYOLOJI",7);
        Teacher mehmet=new Teacher("MEHMET","INGILIZCE",5);

        mat.addteacher(merve);
        kimya.addteacher(ahmet);
        fizik.addteacher(mehmet);

        Student s1=new Student("ALI ",7,mat,kimya,fizik);
        s1.examcourse(100,100,100,100,100,80);
        mat.addteacher(merve);
        kimya.addteacher(ahmet);
        fizik.addteacher(mehmet);
        s1.printcourse();
        s1.Average();
        s1.ispass();
        System.out.println("------------------------------");
        Student s2=new Student("AYŞE",8,mat,kimya,fizik);
        s2.examcourse(85,75,95,100,95,90);
        mat.addteacher(merve);
        kimya.addteacher(ahmet);
        fizik.addteacher(mehmet);
        s2.printcourse();
        s2.Average();
        s2.ispass();







    }
}