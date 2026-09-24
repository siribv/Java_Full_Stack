class Teacherdetails{
    String teachername;
    String subjectname;
    String patiencelevel;
    Teacherdetails(String teachername,String subjectname,String patiencelevel)
    {
        this.teachername=teachername;
        this.subjectname=subjectname;
        this.patiencelevel=patiencelevel;
    }
    void givingassignment()
    {
        if(patiencelevel == "high")
        {
            System.out.println("giving less assignments");
        }

        
    }
    void teachingskills(){
        if(subjectname== "java")
        {
            System.out.println(" have a good teaching skills ");
        }

    }

}
public class Teacher{
    public static void main(String[] args)
    {
        Teacherdetails t1=new Teacherdetails("mohan","java","high");
        t1.givingassignment();
        t1.teachingskills();

    }
}