package exam2.models;

public class StatusA implements Lisenok{
    private int name;

    public StatusA(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public void getstatus(String status) {
        System.out.println("выбрали статус А");
    }
}
