

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        // 1. Pengujian Add & Duplicate Check
        System.out.println("=== 1. TEST TAMBAH KARAKTER & DUPLIKASI ===");
        manager.addCharacter(new Character("Arthas", CharacterType.WARRIOR, 1, 100, 20, 30));
        manager.addCharacter(new Character("Jaina", CharacterType.MAGE, 2, 90, 25, 80));
        manager.addCharacter(new Character("Thrall", CharacterType.WARRIOR, 3, 120, 30, 40));
        
        // Mencoba memasukkan nama duplikat
        manager.addCharacter(new Character("Arthas", CharacterType.ASSASSIN, 5, 150, 50, 100));

        // 2. Pengujian Mini-Challenge & Fitur Mandiri
        System.out.println("\n=== 2. TEST ANALITIK & MINI-CHALLENGE ===");
        System.out.println("Total Karakter Aktif: " + manager.getTotalCharacters());
        System.out.println("Rata-rata Level Karakter: " + manager.getAverageLevel());
        
        System.out.println("Karakter Tipe WARRIOR:");
        for (Character c : manager.findByType(CharacterType.WARRIOR)) {
            System.out.println(" - " + c.getName());
        }

        Character strongest = manager.findStrongestCharacter();
        System.out.println("Karakter Terkuat: " + (strongest != null ? strongest.getName() + " (Attack: " + strongest.getAttackPower() + ")" : "Tidak ada"));

        // 3. Eksperimen Object Reference & Defensive Copy
        System.out.println("\n=== 3. EKSPERIMEN OBJECT REFERENCE ===");
        Character a = manager.findByName("Arthas");
        Character b = a; // Assignment reference
        b.setLevel(5);
        System.out.println("a.getLevel() setelah b diubah: " + a.getLevel());
        System.out.println("Apakah a == b? " + (a == b));

        // Uji Defensive Copy pada getAllCharacters()
        List<Character> externalList = manager.getAllCharacters();
        externalList.clear(); // Mencoba menghapus list luar
        System.out.println("Jumlah karakter di manager setelah list luar di-clear: " + manager.getTotalCharacters());
    }
}