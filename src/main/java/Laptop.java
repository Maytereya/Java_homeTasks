public class Laptop {
    //1 - ОЗУ
    //2 - Объем ЖД hd hdd
    //3 - Операционная система
    //4 - Цвет
    private final String brand;
    private final Double monitor_size;
    private String OS;
    private final String body_color;
    private final Integer SSD;
    private final Integer RAM;

    public Laptop(String brand, Double monitor_size, String OS, String body_color, Integer SSD, Integer RAM) {
        this.brand = brand;
        this.monitor_size = monitor_size;
        this.OS = OS;
        this.body_color = body_color;
        this.SSD = SSD;
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public String getBody_color() {
        return body_color;
    }

    public Integer getSSD() {
        return SSD;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + this.brand + ", диагональ: "
                + this.monitor_size + " in, " + "RAM: " + this.RAM + "GB, "
                + "SSD: " + this.SSD + "GB" + "\n";
    }
}
