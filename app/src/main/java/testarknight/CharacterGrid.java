package testarknight;

import java.awt.*;
import javax.swing.*;

public class CharacterGrid extends JPanel {

    public CharacterGrid() {
        
        // Set grid foundation
        setLayout(new GridLayout(0, 4, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
        setBackground(Color.decode("#2D2D2D"));
        
        // Adding every single HSR character (playable and soon to be playable)
        add(new CharacterCard("Acheron", "/acheron.png", "Lightning", 5));
        add(new CharacterCard("Aglaea", "/aglaea.png", "Lightning", 5));
        add(new CharacterCard("Anaxa", "/anaxa.png", "Wind", 5));
        add(new CharacterCard("Archer", "/archer.png", "Quantum", 5));
        add(new CharacterCard("Argenti", "/argenti.png", "Physical", 5));
        add(new CharacterCard("Arlan", "/arlan.png", "Lightning", 4));
        add(new CharacterCard("Asta", "/asta.png", "Fire", 4));
        add(new CharacterCard("Aventurine", "/aventurine.png", "Imaginary", 5));
        add(new CharacterCard("Bailu", "/bailu.png", "Lightning", 5));
        add(new CharacterCard("Black Swan", "/blackswan.png", "Wind", 5));
        add(new CharacterCard("Blade", "/blade.png", "Wind", 5));
        add(new CharacterCard("Boothill", "/boothill.png", "Physical", 5));
        add(new CharacterCard("Bronya", "/bronya.png", "Wind", 5));
        add(new CharacterCard("Castorice", "/castorIce.png", "Quantum", 5));
        add(new CharacterCard("Cipher", "/cipher.png", "Quantum", 5));
        add(new CharacterCard("Clara", "/clara.png", "Physical", 5));
        add(new CharacterCard("Dan Heng", "/danheng.png", "Wind", 4));
        add(new CharacterCard("Dan Heng - Imbibitor Lunae", "/danhengil.png", "Imaginary", 5));
        add(new CharacterCard("Dr. Ratio", "/drratio.png", "Imaginary", 5));
        add(new CharacterCard("Feixiao", "/feixiao.png", "Wind", 5));
        add(new CharacterCard("Firefly", "/Firefly.png", "Fire", 5));
        add(new CharacterCard("Fu Xuan", "/fuxuan.png", "Quantum", 5));
        add(new CharacterCard("Fugue", "/fugue.png", "Fire", 5));
        add(new CharacterCard("Gallagher", "/gallagher.png", "Fire", 4));
        add(new CharacterCard("Gepard", "/gepard.png", "Ice", 5));
        add(new CharacterCard("Guinaifen", "/guinaifen.png", "Fire", 4));
        add(new CharacterCard("Hanya", "/hanya.png", "Physical", 4));
        add(new CharacterCard("Herta", "/herta.png", "Ice", 4));
        add(new CharacterCard("Himeko", "/himeko.png", "Fire", 5));
        add(new CharacterCard("Hook", "/hook.png", "Fire", 4));
        add(new CharacterCard("Huohuo", "/huohuo.png", "Wind", 5));
        add(new CharacterCard("Hyacine", "/hyacine.png", "Wind", 5));
        add(new CharacterCard("Jade", "/jade.png", "Quantum", 5));
        add(new CharacterCard("Jiaoqiu", "/jiaoqiu.png", "Fire", 5));
        add(new CharacterCard("Jing Yuan", "/jingyuan.png", "Lightning", 5));
        add(new CharacterCard("Jingliu", "/jingliu.png", "Ice", 5));
        add(new CharacterCard("Kafka", "/kafka.png", "Lightning", 5));
        add(new CharacterCard("Lingsha", "/lingsha.png", "Fire", 5));
        add(new CharacterCard("Luka", "/luka.png", "Physical", 4));
        add(new CharacterCard("Luocha", "/luocha.png", "Imaginary", 5));
        add(new CharacterCard("Lynx", "/lynx.png", "Quantum", 4));
        add(new CharacterCard("March 7th (Preservation)", "/march7thp.png", "Ice", 4));
        add(new CharacterCard("March 7th (Hunt)", "/march7thh.png", "Imaginary", 4));
        add(new CharacterCard("Misha", "/misha.png", "Ice", 4));
        add(new CharacterCard("Moze", "/moze.png", "Lightning", 4));
        add(new CharacterCard("Mydei", "/mydei.png", "Imaginary", 5));
        add(new CharacterCard("Natasha", "/natasha.png", "Physical", 4));
        add(new CharacterCard("Pela", "/pela.png", "Ice", 4));
        add(new CharacterCard("Phainon", "/phainon.png", "Physical", 5));
        add(new CharacterCard("Qingque", "/qingque.png", "Quantum", 4));
        add(new CharacterCard("Rappa", "/rappa.png", "Imaginary", 5));
        add(new CharacterCard("Robin", "/robin.png", "Physical", 5));
        add(new CharacterCard("Ruan Mei", "/ruanmei.png", "Ice", 5));
        add(new CharacterCard("Saber", "/saber.png", "Wind", 5));
        add(new CharacterCard("Sampo", "/sampo.png", "Wind", 4));
        add(new CharacterCard("Seele", "/seele.png", "Quantum", 5));
        add(new CharacterCard("Serval", "/serval.png", "Lightning", 4));
        add(new CharacterCard("Silver Wolf", "/silverwolf.png", "Quantum", 5));
        add(new CharacterCard("Sparkle", "/sparkle.png", "Quantum", 5));
        add(new CharacterCard("Sunday", "/sunday.png", "Imaginary", 5));
        add(new CharacterCard("Sushang", "/sushang.png", "Physical", 4));
        add(new CharacterCard("The Herta", "/herta2.png", "Ice", 5));
        add(new CharacterCard("Tingyun", "/tingyun.png", "Lightning", 4));
        add(new CharacterCard("Topaz & Numby", "/topaznumby.png", "Fire", 5));
        add(new CharacterCard("Trailblazer (Destruction)", "/tbd.png", "Physical", 5));
        add(new CharacterCard("Trailblazer (Preservation)", "/tbp.png", "Fire", 5));
        add(new CharacterCard("Trailblazer (Harmony)", "/tbh.png", "Imaginary", 5));
        add(new CharacterCard("Trailblazer (Remembrance)", "/tbr.png", "Ice", 5));
        add(new CharacterCard("Tribbie", "/tribbie.png", "Quantum", 5));
        add(new CharacterCard("Welt", "/welt.png", "Imaginary", 5));
        add(new CharacterCard("Xueyi", "/xueyi.png", "Quantum", 4));
        add(new CharacterCard("Yanqing", "/yanqing.png", "Ice", 5));
        add(new CharacterCard("Yukong", "/yukong.png", "Imaginary", 4));
        add(new CharacterCard("Yunli", "/yunli.png", "Physical", 5));
    }
}
