@Version(version_number = 7.1, version_codename = "Nougat")
public class MyService {
    private String name;
    private String id;

    public MyService() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return id;
    }

    public void setIp(String ip) {
        this.id = ip;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + name.hashCode();
        result = prime * result + id.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyService other = (MyService) obj;
        if (!name.equals(other.name))
            return false;
        if (!id.equals(other.id))
            return false;
        return true;
    }

    private void thisClassInfo() {
        System.out.println("Объект " + name + " c IP адресом " + id + " выводится на экран. Значит аннотация работает!");

    }

}
