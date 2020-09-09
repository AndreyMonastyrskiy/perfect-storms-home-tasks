package module02.TASK_09;

public class Programmer {
    private String name;
    private int age;
    private Experience experience;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
        this.experience = new Experience();
        System.out.println(String.format("In the matrix there is a new programmer named %s, he is %d years old.",
                this.name, this.age));
        System.out.println(String.format("Approximate work experience - %d years.", this.experience.summary));
    }

    private class Experience {
        private int summary;

        public Experience() {
            final int result = (age - 20) / 2;
            this.summary = result >= 0 ? result: 0;
        }

        public int getSummary() {
            return this.summary;
        }

    }

    public static class Stack {
        private String[] skills;

        public Stack(String[] skills) {
            this.skills = skills;
        }

        public String[] getSkills() {
            return this.skills;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String analysis(Stack stack) {
        String result = "Threat level: ";
        int threatLevel = this.experience.getSummary() + (int)(stack.getSkills().length * 0.2);

        if (threatLevel > 0 && threatLevel < 5) {
            result += "Weak";
        } else if (threatLevel > 4 && threatLevel < 9) {
            result += "Serious, establish surveillance!";
        } else if (threatLevel > 8 && threatLevel < 13) {
            result += "Dangerous, send Smith to him!";
        } else if (threatLevel > 12) {
            result += "He is the chosen one...";
        } else {
            result += "Is absent";
        }

        return result;
    }

}
