package testarknight;

import java.awt.*;
import javax.swing.*;

public class CharacterGrid extends JPanel {

    public CharacterGrid() {
        
        // Set grid foundation
        setLayout(new GridLayout(0, 4, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setBackground(Color.decode("#2D2D2D"));
        
        // Adding every single HSR character (playable and soon to be playable)
        add(new CharacterCard("Acheron", "/acheron.png", "Lightning", "Nihility", 5));
        add(new CharacterCard("Aglaea", "/aglaea.png", "Lightning", "Remembrance", 5));
        add(new CharacterCard("Anaxa", "/anaxa.png", "Wind", "Erudition", 5));
        add(new CharacterCard("Archer", "/archer.png", "Quantum", "Hunt", 5));
        add(new CharacterCard("Argenti", "/argenti.png", "Physical", "Erudition",5));
        add(new CharacterCard("Arlan", "/arlan.png", "Lightning", "Destruction", 4));
        add(new CharacterCard("Asta", "/asta.png", "Fire", "Harmony", 4));
        add(new CharacterCard("Aventurine", "/aventurine.png", "Imaginary", "Preservation", 5));
        add(new CharacterCard("Bailu", "/bailu.png", "Lightning", "Abundance", 5));
        add(new CharacterCard("Black Swan", "/blackswan.png", "Wind", "Nihility", 5));
        add(new CharacterCard("Blade", "/blade.png", "Wind", "Destruction", 5));
        add(new CharacterCard("Boothill", "/boothill.png", "Physical", "Hunt", 5));
        add(new CharacterCard("Bronya", "/bronya.png", "Wind", "Harmony", 5));
        add(new CharacterCard("Castorice", "/castorIce.png", "Quantum", "Remembrance", 5));
        add(new CharacterCard("Cipher", "/cipher.png", "Quantum", "Nihility", 5));
        add(new CharacterCard("Clara", "/clara.png", "Physical", "Destruction", 5));
        add(new CharacterCard("Dan Heng", "/danheng.png", "Wind", "Hunt", 4));
        add(new CharacterCard("Dan Heng - Imbibitor Lunae", "/danhengil.png", "Imaginary", "Destruction", 5));
        add(new CharacterCard("Dr. Ratio", "/drratio.png", "Imaginary", "Hunt", 5));
        add(new CharacterCard("Feixiao", "/feixiao.png", "Wind", "Hunt", 5));
        add(new CharacterCard("Firefly", "/Firefly.png", "Fire", "Destruction", 5));
        add(new CharacterCard("Fu Xuan", "/fuxuan.png", "Quantum", "Preservation", 5));
        add(new CharacterCard("Fugue", "/fugue.png", "Fire", "Nihility", 5));
        add(new CharacterCard("Gallagher", "/gallagher.png", "Fire", "Abundance", 4));
        add(new CharacterCard("Gepard", "/gepard.png", "Ice", "Preservation", 5));
        add(new CharacterCard("Guinaifen", "/guinaifen.png", "Fire", "Nihility", 4));
        add(new CharacterCard("Hanya", "/hanya.png", "Physical", "Harmony", 4));
        add(new CharacterCard("Herta", "/herta.png", "Ice", "Erudition", 4));
        add(new CharacterCard("Himeko", "/himeko.png", "Fire", "Erudition", 5));
        add(new CharacterCard("Hook", "/hook.png", "Fire", "Destruction", 4));
        add(new CharacterCard("Huohuo", "/huohuo.png", "Wind", "Abundance", 5));
        add(new CharacterCard("Hyacine", "/hyacine.png", "Wind", "Remembrance", 5));
        add(new CharacterCard("Jade", "/jade.png", "Quantum", "Erudition", 5));
        add(new CharacterCard("Jiaoqiu", "/jiaoqiu.png", "Fire", "Nihility", 5));
        add(new CharacterCard("Jing Yuan", "/jingyuan.png", "Lightning", "Erudition", 5));
        add(new CharacterCard("Jingliu", "/jingliu.png", "Ice", "Destruction", 5));
        add(new CharacterCard("Kafka", "/kafka.png", "Lightning", "Nihility",5));
        add(new CharacterCard("Lingsha", "/lingsha.png", "Fire", "Abundance", 5));
        add(new CharacterCard("Luka", "/luka.png", "Physical", "Nihility", 4));
        add(new CharacterCard("Luocha", "/luocha.png", "Imaginary", "Abundance", 5));
        add(new CharacterCard("Lynx", "/lynx.png", "Quantum", "Abundance", 4));
        add(new CharacterCard("March 7th (Preservation)", "/march7thp.png", "Ice", "Preservation", 4));
        add(new CharacterCard("March 7th (Hunt)", "/march7thh.png", "Imaginary", "Hunt", 4));
        add(new CharacterCard("Misha", "/misha.png", "Ice", "Destruction", 4));
        add(new CharacterCard("Moze", "/moze.png", "Lightning", "Hunt", 4));
        add(new CharacterCard("Mydei", "/mydei.png", "Imaginary", "Destruction", 5));
        add(new CharacterCard("Natasha", "/natasha.png", "Physical", "Abundance", 4));
        add(new CharacterCard("Pela", "/pela.png", "Ice", "Nihility", 4));
        add(new CharacterCard("Phainon", "/phainon.png", "Physical", "Destruction", 5));
        add(new CharacterCard("Qingque", "/qingque.png", "Quantum", "Erudition", 4));
        add(new CharacterCard("Rappa", "/rappa.png", "Imaginary", "Erudition", 5));
        add(new CharacterCard("Robin", "/robin.png", "Physical", "Harmony", 5));
        add(new CharacterCard("Ruan Mei", "/ruanmei.png", "Ice", "Harmony", 5));
        add(new CharacterCard("Saber", "/saber.png", "Wind", "Destruction", 5));
        add(new CharacterCard("Sampo", "/sampo.png", "Wind", "Nihility", 4));
        add(new CharacterCard("Seele", "/seele.png", "Quantum", "Hunt", 5));
        add(new CharacterCard("Serval", "/serval.png", "Lightning", "Erudition", 4));
        add(new CharacterCard("Silver Wolf", "/silverwolf.png", "Quantum", "Nihility", 5));
        add(new CharacterCard("Sparkle", "/sparkle.png", "Quantum", "Harmony", 5));
        add(new CharacterCard("Sunday", "/sunday.png", "Imaginary", "Harmony", 5));
        add(new CharacterCard("Sushang", "/sushang.png", "Physical", "Hunt", 4));
        add(new CharacterCard("The Herta", "/herta2.png", "Ice", "Erudition", 5));
        add(new CharacterCard("Tingyun", "/tingyun.png", "Lightning", "Harmony", 4));
        add(new CharacterCard("Topaz & Numby", "/topaznumby.png", "Fire", "Hunt", 5));
        add(new CharacterCard("Trailblazer (Destruction)", "/tbd.png", "Physical", "Destruction", 5));
        add(new CharacterCard("Trailblazer (Preservation)", "/tbp.png", "Fire", "Harmony", 5));
        add(new CharacterCard("Trailblazer (Harmony)", "/tbh.png", "Imaginary", "Preservation", 5));
        add(new CharacterCard("Trailblazer (Remembrance)", "/tbr.png", "Ice", "Remembrance", 5));
        add(new CharacterCard("Tribbie", "/tribbie.png", "Quantum", "Harmony", 5));
        add(new CharacterCard("Welt", "/welt.png", "Imaginary", "Nihility", 5));
        add(new CharacterCard("Xueyi", "/xueyi.png", "Quantum", "Destruction", 4));
        add(new CharacterCard("Yanqing", "/yanqing.png", "Ice", "Hunt", 5));
        add(new CharacterCard("Yukong", "/yukong.png", "Imaginary", "Harmony", 4));
        add(new CharacterCard("Yunli", "/yunli.png", "Physical", "Destruction", 5));
    }
}
