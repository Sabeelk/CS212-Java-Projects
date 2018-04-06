public class Main{
  public static void main(String[] args){
    //creating new GradedActivity Objects
    GradedActivity lab = new GradedActivity(98.5);
    GradedActivity essay = new GradedActivity(74.2);

    CourseGrades test = new CourseGrades();
    test.setLab(lab);
    test.setEssay(essay);
    System.out.print(test.toString(lab.getGrade(), essay.getGrade()));
  }
}
