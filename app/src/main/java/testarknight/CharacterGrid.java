package testarknight;

import java.awt.*;
import javax.swing.*;

public class CharacterGrid extends JPanel {

    public CharacterGrid() {
        
        // Set grid foundation
        setLayout(new GridLayout(0, 4, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
        setBackground(Color.GRAY);
        
        // Adding every single HSR character (playable and soon to be playable)
        add(new Character("Acheron", "/acheron.png"));
        add(new Character("Aglaea", "/aglaea.png"));
        add(new Character("Anaxa", "/anaxa.png"));
        add(new Character("Archer", "/archer.png"));
        add(new Character("Argenti", "/argenti.png"));
        add(new Character("Asta", "/asta.png"));
        add(new Character("Aventurine", "/aventurine.png"));
        add(new Character("Bailu", "/bailu.png"));
        add(new Character("Black Swan", "/blackswan.png"));
        add(new Character("Blade", "/blade.png"));
        add(new Character("Boothill", "/boothill.png"));
        add(new Character("Bronya", "/bronya.png"));
        add(new Character("Castorice", "/castorice.png"));
        add(new Character("Clara", "/clara.png"));
        add(new Character("Cipher", "/cipher.png"));
        add(new Character("Dan Heng", "/danheng.png"));
        add(new Character("Dan Heng - Imbibitor Lunae", "/danhengil.png"));
        add(new Character("Dr. Ratio", "/drratio.png"));
        add(new Character("Feixiao", "/feixiao.png"));
        add(new Character("Firefly", "/firefly.png"));
        add(new Character("Fugue", "/fugue.png"));
        add(new Character("Fu Xuan", "/fuxuan.png"));
        add(new Character("Gallagher", "/gallagher.png"));
        add(new Character("Gepard", "/gepard.png"));
        add(new Character("Guinaifen", "/guinaifen.png"));
        add(new Character("Hanya", "/hanya.png"));
        add(new Character("Herta", "/herta.png"));
        add(new Character("Himeko", "/himeko.png"));
        add(new Character("Hook", "/hook.png"));
        add(new Character("Huohuo", "/huohuo.png"));
        add(new Character("Hyacine", "/hyacine.png"));
        add(new Character("Jade", "/jade.png"));
        add(new Character("Jiaoqiu", "/jiaoqiu.png"));
        add(new Character("Jingliu", "/jingliu.png"));
        add(new Character("Jing Yuan", "/jingyuan.png"));
        add(new Character("Kafka", "/kafka.png"));
        add(new Character("Lingsha", "/lingsha.png"));
        add(new Character("Luka", "/luka.png"));
        add(new Character("Luocha", "/luocha.png"));
        add(new Character("Lynx", "/lynx.png"));
        add(new Character("March 7th (Preservation)", "/march7thp.png"));
        add(new Character("March 7th (Hunt)", "/march7thh.png"));
        add(new Character("Misha", "/misha.png"));
        add(new Character("Moze", "/moze.png"));
        add(new Character("Mydei", "/mydei.png"));
        add(new Character("Natasha", "/natasha.png"));
        add(new Character("Pela", "/pela.png"));
        add(new Character("Qingque", "/qingque.png"));
        add(new Character("Phainon", "/phainon.png"));
        add(new Character("Rappa", "/rappa.png"));
        add(new Character("Robin", "/robin.png"));
        add(new Character("Ruan Mei", "/ruanmei.png"));
        add(new Character("Saber", "/saber.png"));
        add(new Character("Sampo", "/sampo.png"));
        add(new Character("Seele", "/seele.png"));
        add(new Character("Serval", "/serval.png"));
        add(new Character("Silver Wolf", "/silverwolf.png"));
        add(new Character("Sparkle", "/sparkle.png"));
        add(new Character("Sunday", "/sunday.png"));
        add(new Character("Sushang", "/sushang.png"));
        add(new Character("The Herta", "/herta2.png"));
        add(new Character("Tingyun", "/tingyun.png"));
        add(new Character("Topaz & Numby", "/topaznumby.png"));
        add(new Character("Trailblazer (Destruction)", "/tbd.png"));
        add(new Character("Trailblazer (Preservation)", "/tbp.png"));
        add(new Character("Trailblazer (Harmony)", "/tbh.png"));
        add(new Character("Trailblazer (Remembrance)", "/tbr.png"));
        add(new Character("Tribbie", "/tribbie.png"));
        add(new Character("Welt", "/welt.png"));
        add(new Character("Xueyi", "/xueyi.png"));
        add(new Character("Yanqing", "/yanqing.png"));
        add(new Character("Yukong", "/yukong.png"));
        add(new Character("Yunli", "/yunli.png"));
    }
}
