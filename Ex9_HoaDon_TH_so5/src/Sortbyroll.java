import java.util.Comparator;

class Sortbyroll implements Comparator<Hang>{
    public int compare(Hang a, Hang b)
    {
        return (int) ((a.getSoLuong()* a.getDonGia()) - (b.getDonGia() * b.getSoLuong()));
    }
}
