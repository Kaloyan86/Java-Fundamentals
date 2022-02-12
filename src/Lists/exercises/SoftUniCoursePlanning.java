package Lists.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] inputCommands = input.split(":");
            String command = inputCommands[0];
            String lessonTitle = inputCommands[1];

            switch (command) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputCommands[2]);
                    if (!schedule.contains(lessonTitle)) {
                        if (index >= 0 && index < schedule.size()) {
                            schedule.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    schedule.remove(lessonTitle);
                    schedule.remove(lessonTitle + "-Exercise");
                    break;
                case "Swap":
                    String swapWithLesson = inputCommands[2];
                    String firstLessonEx = lessonTitle + "-Exercise";
                    String secondLessonEx = swapWithLesson + "-Exercise";
                    if (schedule.contains(lessonTitle) && schedule.contains(swapWithLesson)) {
                        int lessonTitleIndex = schedule.indexOf(lessonTitle);
                        int swapWithIndex = schedule.indexOf(swapWithLesson);
                        Collections.swap(schedule,lessonTitleIndex,swapWithIndex);
//                        schedule.add(swapWithIndex, lessonTitle);
//                        schedule.remove(swapWithLesson);
//                        schedule.remove(lessonTitle);
//                        schedule.add(lessonTitleIndex, swapWithLesson);
                    }
                    if (schedule.contains(firstLessonEx)) {
                        Collections.swap(schedule,schedule.indexOf(firstLessonEx),schedule.indexOf(lessonTitle) + 1);
//                        schedule.remove(firstLessonEx);
//                        schedule.add(schedule.indexOf(lessonTitle) + 1, firstLessonEx);
                    }
                    if (schedule.contains(secondLessonEx)) {
                        schedule.remove(secondLessonEx);
                        schedule.add(schedule.indexOf(swapWithLesson) + 1, secondLessonEx);
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    if (schedule.contains(lessonTitle) && !schedule.contains(exercise)) {
                        schedule.add(schedule.indexOf(lessonTitle) + 1, exercise);
                    } else if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 1; i <= schedule.size(); i++) {
            System.out.println(i + "." + schedule.get(i - 1));
        }
    }
}

