package Week9;

class Student {
    private String name;
    private String id;
    private Module[] modules;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.modules = new Module[5];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }

    public void setModule(Module module, int index) {
        if (index >= 0 && index < modules.length) {
            if (modules[index] == null) {
                modules[index] = module;
            } else {
                System.out.println("Module already exists at index " + index);
            }
        } else {
            System.out.println("Invalid index: " + index);
        }
    }

    public void showPass() {
        for (Module module : modules) {
            if (module != null && module.Pass()) {
                System.out.println(module + " : passed");
            }
        }
    }
}

class Module {
    private String moduleCode;
    private double ictMarks;
    private double cwMarks;

    public Module(String moduleCode, double ictMarks, double cwMarks) {
        this.moduleCode = moduleCode;
        this.ictMarks = ictMarks;
        this.cwMarks = cwMarks;
    }

    private double getFinalMark() {
        return 0.5 * ictMarks + 0.5 * cwMarks;
    }

    public boolean Pass() {
        return getFinalMark() >= 40;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    @Override
    public String toString() {
        return "Module Code: " + moduleCode;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "1234");
        Module module1 = new Module("CT123", 50, 60);
        student1.setModule(module1, 0);
        student1.showPass();
    }
}
    