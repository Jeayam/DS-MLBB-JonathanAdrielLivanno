package mobile.legends.ds;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeMLBBTutorial {

    static class ItemNode {
        String name;
        String note;
        List<ItemNode> children;

        ItemNode(String name, String note) {
            this.name = name;
            this.note = note;
            this.children = new ArrayList<>();
        }

        void addChild(ItemNode child) {
            children.add(child);
        }
    }

    static ItemNode findNode(ItemNode node, String target) {
    if (node == null) return null;

    if (node.name.equalsIgnoreCase(target)) {
        return node;
    }

    for (ItemNode child : node.children) {
        ItemNode result = findNode(child, target);
        if (result != null) return result;
    }

    return null;
}
static void printSubTree(ItemNode node, int level) {
    if (node == null) return;

    String indent = " ".repeat(level * 2);
    System.out.println(indent + "- " + node.name);

    for (ItemNode child : node.children) {
        printSubTree(child, level + 1);
    }
}

    static void printTree(ItemNode node, int level) {
        if (node == null) return;

        String indent = " ".repeat(level * 2);
        System.out.println(indent + "- " + node.name + " -> " + node.note);

        for (ItemNode child : node.children) {
            printTree(child, level + 1);
        }
    }

    static void printAllBuildPaths(ItemNode node, List<String> path) {
        if (node == null) return;

        path.add(node.name);

        if (node.children.isEmpty()) {
            System.out.println(String.join(" -> ", path));
        } else {
            for (ItemNode child : node.children) {
                printAllBuildPaths(child, path);
            }
        }

        path.remove(path.size() - 1);
    }

    static int countNodes(ItemNode node) {
        if (node == null) return 0;

        int total = 1;
        for (ItemNode child : node.children) {
            total += countNodes(child);
        }
        return total;
    }

    static int countLeaves(ItemNode node) {
        if (node == null) return 0;
        if (node.children.isEmpty()) return 1;

        int total = 0;
        for (ItemNode child : node.children) {
            total += countLeaves(child);
        }
        return total;
    }

    static int height(ItemNode node) {
        if (node == null) return 0;
        if (node.children.isEmpty()) return 1;

        int maxChildHeight = 0;
        for (ItemNode child : node.children) {
            maxChildHeight = Math.max(maxChildHeight, height(child));
        }
        return 1 + maxChildHeight;
    }

    static boolean findPath(ItemNode node, String target, List<String> path) {
        if (node == null) return false;

        path.add(node.name);

        if (node.name.equalsIgnoreCase(target)) {
            return true;
        }

        for (ItemNode child : node.children) {
            if (findPath(child, target, path)) {
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }

    static int countItemOccurrences(ItemNode node, String target) {
        if (node == null) return 0;

        int count = 0;

        if (node.name.equalsIgnoreCase(target)) {
            count++;
        }

        for (ItemNode child : node.children) {
            count += countItemOccurrences(child, target);
        }

        return count;
    }

    public static void main(String[] args) {

        // ROOT
        ItemNode root = new ItemNode("Start Build", "Choose the item you want to make");

        ItemNode fleeting   = new ItemNode("Fleeting Time", "Best equipped by heroes who rely heavily on Ultimates.");
        ItemNode radiant    = new ItemNode("Radiant Armor", "Reduces continuous Magic Damage.");
        ItemNode chastise   = new ItemNode("Chastise Pauldron", "Best equipped to counter heroes with high Attack Speed.");
        ItemNode brute      = new ItemNode("Brute Force Breastplate", "Gains Speed and Defense while attacking.");
        ItemNode immo       = new ItemNode("Immortality", "Resurrects hero after death.");
        ItemNode domi       = new ItemNode("Dominance Ice", "Reduces enemy Attack Speed & Healing/Shields.");
        ItemNode athena     = new ItemNode("Athena's Shield", "Reduces incoming Magic Burst damage.");
        ItemNode guardian   = new ItemNode("Guardian Helmet", "High HP recovery when out of combat.");
        ItemNode thunder    = new ItemNode("Thunder Belt", "Deals True Damage and slows after skills.");
        ItemNode queens     = new ItemNode("Queen's Wings", "Best equipped to greatly increase their abilities to resist Magic burst damage.");
        ItemNode cursed     = new ItemNode("Cursed Helmet", "Deals burning damage to nearby enemies.");
        ItemNode oracle     = new ItemNode("Oracle", "Boosts self-regen and shield effects.");
        ItemNode blade      = new ItemNode("Blade Armor", "Reflects basic attacks & reduces crit damage.");
        ItemNode antiq      = new ItemNode("Antique Cuirass", "Reduces enemy Physical Attack when hit by skills.");

        ItemNode steel      = new ItemNode("Steel Legplates", "Increases Physical Defense.");
        ItemNode steelc     = new ItemNode("Steel Legplates", "Increases Physical Defense.");
        ItemNode dread      = new ItemNode("Dreadnaught Armor", "Reduces enemy Physical Attack when hit by skills.");
        ItemNode dreada     = new ItemNode("Dreadnaught Armor", "Reduces enemy Physical Attack when hit by skills.");
        ItemNode black      = new ItemNode("Black Ice Shield", "Reduces enemy Attack Speed and adds Mana.");
        ItemNode silence    = new ItemNode("Silence Robe", "Increases Magic Defense.");
        ItemNode molten     = new ItemNode("Molten Essence", "Deals continuous burning damage to nearby enemies.");
        ItemNode ares       = new ItemNode("Ares Belt", "Increases Max HP.");
        ItemNode aresg      = new ItemNode("Ares Belt", "Increases Max HP.");
        ItemNode aresg2     = new ItemNode("Ares Belt", "Increases Max HP.");
        ItemNode aresg3     = new ItemNode("Ares Belt", "Increases Max HP.");
        

         
        ItemNode leather        = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leathers       = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leathert       = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherdo      = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherbl      = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherbl2     = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherdr      = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherdrr     = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherd       = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherc       = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherb       = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatheri       = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode leatherbr      = new ItemNode("Leather Jerkin", "Increases Physical Defense.");
        ItemNode cloakr         = new ItemNode("Magic Resistance Cloak", "Increases Magic Defense.");
        ItemNode cloaks         = new ItemNode("Magic Resistance Cloak", "Increases Magic Defense.");
        ItemNode cloakm         = new ItemNode("Magic Resistance Cloak", "Increases Magic Defense.");
        ItemNode cloakt         = new ItemNode("Magic Resistance Cloak", "Increases Magic Defense.");
        ItemNode cloaksb        = new ItemNode("Magic Resistance Cloak", "Increases Magic Defense.");
        ItemNode cloakd         = new ItemNode("Magic Resistance Cloak", "Increases Magic Defense.");
        ItemNode vitality       = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalitya      = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalitys      = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalityi      = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalityg      = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalityg2     = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalityg3     = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalitym      = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode vitalityo      = new ItemNode("Vitality Crystal", "Increases Max HP.");
        ItemNode healingr       = new ItemNode("Healing Necklace", "Increases HP Regen.");
        ItemNode heroo           = new ItemNode("Hero's Ring", "Increases Max HP and provides Cooldown Reduction.");
        ItemNode heroo2          = new ItemNode("Hero's Ring", "Increases Max HP and provides Cooldown Reduction.");
        ItemNode hero2          = new ItemNode("Hero's Ring", "Increases Max HP and provides Cooldown Reduction.");
        ItemNode heros          = new ItemNode("Hero's Ring", "Increases Max HP and provides Cooldown Reduction.");
        ItemNode herof          = new ItemNode("Hero's Ring", "Increases Max HP and provides Cooldown Reduction.");
        ItemNode herob          = new ItemNode("Hero's Ring", "Increases Max HP and provides Cooldown Reduction.");
        ItemNode expert         = new ItemNode("Expert Gloves", "Increases Adaptive Attack");
        ItemNode experts        = new ItemNode("Expert Gloves", "Increases Adaptive Attack");
                
        //Item Tier 2
        silence.addChild(vitalitys);
        vitalitys.addChild(cloaks);

        steel.addChild(leathers);

        ares.addChild(vitality);

        black.addChild(leatherb);
        leatherb.addChild(cloaksb);
        
        molten.addChild(vitalitym);

        dread.addChild(leatherd);
        leatherd.addChild(leather);

        //Item Tier 3 FINAL ITEM
        root.addChild(fleeting);
            fleeting.addChild(hero2);
            hero2.addChild(herof);
            herof.addChild(expert);

        root.addChild(radiant);
            radiant.addChild(cloakr);
            cloakr.addChild(healingr);
            healingr.addChild(silence);

        root.addChild(chastise);
            chastise.addChild(steelc);
            steelc.addChild(leatherc);
            leatherc.addChild(ares);

        root.addChild(brute);
            brute.addChild(herob);
            herob.addChild(leatherbr);
            leatherbr.addChild(ares);

        root.addChild(immo);
            immo.addChild(vitalityi);
            vitalityi.addChild(leatheri);
            leatheri.addChild(ares);

        root.addChild(domi);
            domi.addChild(leatherdo);
            leatherdo.addChild(cloakd);
            cloakd.addChild(black);

        root.addChild(athena);
            athena.addChild(vitalitya);
            vitalitya.addChild(silence);

        root.addChild(guardian);
            guardian.addChild(aresg);
            aresg.addChild(vitalityg);
            vitalityg.addChild(aresg2);
            aresg2.addChild(vitalityg2);
            vitalityg2.addChild(aresg3);
            aresg3.addChild(vitalityg3);
            ItemNode codex = new ItemNode("Mystery Codex", "Increase Magic Power");
            vitalityg3.addChild(codex); // Task 4

        root.addChild(thunder);
            thunder.addChild(leathert);
            leathert.addChild(cloakt);
            cloakt.addChild(ares);

        root.addChild(queens);
            queens.addChild(heros);
            heros.addChild(experts);
            experts.addChild(ares);

        root.addChild(cursed);
            cursed.addChild(molten);
            vitalitym.addChild(cloakm);
            cloakm.addChild(ares);

        root.addChild(oracle);
            oracle.addChild(heroo);
            heroo.addChild(heroo2);
            heroo2.addChild(vitalityo);

        root.addChild(blade);
            blade.addChild(leatherbl);
            leatherbl.addChild(leatherbl2);
            leatherbl2.addChild(steel);

        root.addChild(antiq);
            antiq.addChild(dreada);
            dreada.addChild(leatherdr);
            leatherdr.addChild(leatherdrr);
            leatherdrr.addChild(ares);

        // ================= OUTPUT =================
        System.out.println("=== TREE STRUCTURE ===");
        printTree(root, 0);

        System.out.println("\n=== ALL BUILD PATHS ===");
        printAllBuildPaths(root, new ArrayList<>());

        System.out.println("\nTotal Nodes: " + countNodes(root));
        System.out.println("Leaf Nodes: " + countLeaves(root));
        System.out.println("Tree Height: " + height(root));

        // SEARCH INPUT (TASK 4)
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter item to build: ");
        String target = sc.nextLine();
        ItemNode found = findNode(root, target);

        if (found != null) {
            System.out.println("\n=== BUILD MATERIALS ===");
            printSubTree(found, 0);
        } else {
            System.out.println("Item not found");
        }

        System.out.println("\nOccurrences of Hero's Ring: " +
        countItemOccurrences(root, "Hero's Ring"));


    }
}