package Model;

public class Shuiku {
    private String id;
    private String name;
    private float x;
    private float y;
    private String bz;

    public Shuiku(String name) {
        this.name = name;
    }
    public Shuiku(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
    public Shuiku(String name, float x, float y, String bz) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.bz = bz;
    }
    public Shuiku(String id, String name, float x, float y, String bz) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.bz = bz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
