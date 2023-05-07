package workout;

import java.util.ArrayList;
import java.util.List;

public class Workout {
    private String type;
    private int exerciseCount;

    private List<Exercise> exercises = new ArrayList<>();

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
    }

    public void addExercise(Exercise exercise) {
        if ((exerciseCount-this.exercises.size())>0) {
            this.exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                this.exercises.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getExerciseCount() {
        return this.exercises.size();
    }

    public Exercise getExercise(String name, String muscle) {
        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (!this.exercises.isEmpty()) {
            Exercise mostBurned = this.exercises.get(0);
            for (int i = 0; i < this.exercises.size(); i++) {
                Exercise exercise = this.exercises.get(i);
                if (mostBurned.getBurnedCalories() < exercise.getBurnedCalories()) {
                    mostBurned = exercise;
                }
            }
            return mostBurned;
        } else {
            return null;
        }

    }
    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        String output1 = String.format("Workout type: %s%n",this.type);
        sb.append(output1);
        for (int i = 0; i < this.exercises.size(); i++) {
            Exercise exercise = this.exercises.get(i);
            String output= String.format("%s%n",exercise);
            sb.append(output);
        }
        return sb.toString();
    }

}

