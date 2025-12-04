// Sam is a professor at the university and likes to round each student's  according to these rules:

// If the difference between the grade and the next multiple of  is less than , round  up to the next multiple of .
// If the value of grade is less than , no rounding occurs as the result will still be a failing grade.

import java.util.ArrayList;
import java.util.List;

public class GradesRoundOff {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < grades.size(); i++){
            if(grades.get(i) < 38){
                result.add(grades.get(i));
            }
            else{
                int nextMultiple = (grades.get(i)/5 + 1) * 5;
                if(nextMultiple - grades.get(i) < 3){
                    result.add(nextMultiple);
                }
                else{
                    result.add(grades.get(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        List<Integer> roundedGrades = gradingStudents(grades);
        for(int grade : roundedGrades){
            System.out.println(grade);
        }
    }
}
