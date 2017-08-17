package kr.anima.xd.s.missiontask;


import java.util.ArrayList;

/**
 * Created by alfo6-10 on 8/17/2017.
 */

public class Mission {

    String missionTitle;
    Boolean isRepeatOfMission=false; // 반복여부
    int startMission=0;
    int completedMission=0;
    int termOfMission=0;

    Boolean isCompleted=false;

    ArrayList<Element> elements=new ArrayList<>();
    ArrayList<Task> tasks=new ArrayList<>();

    public Mission() {
        for(int i=0; i<9; i++){
            elements.add(new Element(R.string.element_appearance+i, false, R.drawable.ic_sel_ele_appearance+i));
        }
    }

    public Mission(String missionTitle, Boolean isRepeatOfMission, int startMission, int compltedMission, Task task) {
        this.missionTitle = missionTitle;
        this.isRepeatOfMission = isRepeatOfMission;
        this.startMission = startMission;
        this.completedMission = compltedMission;
        tasks.add(task);
        termOfMission=compltedMission-startMission;
    }

    public void AddTask(String taskTitle, Boolean isRepeatOfTask, int taskOfBegin, int taskOfFinished, ArrayList<Element> elements){
        tasks.add(new Task(taskTitle, isRepeatOfTask, taskOfBegin, taskOfFinished, elements));
    }

    public void removeTask(){

    }

    public void editTask(){

    }

    public boolean checkedMission(int completedMission, int startMission, int termOfMission){
        termOfMission=completedMission-startMission;
        if(!isRepeatOfMission && termOfMission<=0) isCompleted=true;
        else isCompleted=false;

        return isCompleted;
    }

    class Task{
        String taskTitle;
        Boolean isRepeatOfTask=true; // 반복여부

        int taskOfBegin =0; // 시작일
        int taskOfFinished =0; //종료일
        int termOfTask = taskOfFinished - taskOfBegin; // 실행기간

        ArrayList<Element> elements;

        public Task(String taskTitle, Boolean isRepeatOfTask, int taskOfBegin, int taskOfFinished, ArrayList<Element> elements) {
            this.taskTitle = taskTitle;
            this.isRepeatOfTask = isRepeatOfTask;
            this.taskOfBegin = taskOfBegin;
            this.taskOfFinished = taskOfFinished;
            this.elements = elements;
            termOfTask = taskOfFinished - taskOfBegin;
        }
    }

    class Element{
        private final int name;
        private final int symbol;
        private Boolean isChecked=false;

        public Element(int name, Boolean isChecked, int symbol) {
            this.name = name;
            this.isChecked = isChecked;
            this.symbol = symbol;
        }
    }
}
