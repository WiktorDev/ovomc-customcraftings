package ga.wiktor330.dev.ovomc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        Bukkit.getServer().broadcastMessage("Plugin zostal stworzony przez wiktor330#1597 (HutWooMeow)");
        ItemStack sword = new ItemStack(Material.DIAMOND_CHESTPLATE); {
            ItemMeta meta = sword.getItemMeta();
            meta.setDisplayName(ChatColor.BLUE+"Diamentowy Napiersnik");
            sword.setItemMeta(meta);
        }

        ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET); {
            ItemMeta meta = helmet.getItemMeta();
            meta.setDisplayName(ChatColor.BLUE + "Diamentowy Helm");
            helmet.setItemMeta(meta);
        }
        ItemStack leggins = new ItemStack(Material.DIAMOND_LEGGINGS); {
            ItemMeta meta = leggins.getItemMeta();
            meta.setDisplayName(ChatColor.BLUE + "Diamentowe nogawice");
            leggins.setItemMeta(meta);
        }
        ItemStack napiersnik = new ItemStack(Material.STICK); {
            ItemMeta meta = leggins.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Ten crafting jest zablokowany!");
            napiersnik.setItemMeta(meta);
        }
        ItemStack helm = new ItemStack(Material.STICK); {
            ItemMeta meta = leggins.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Ten crafting jest zablokowany!");
            helm.setItemMeta(meta);
        }
        ItemStack nogawice = new ItemStack(Material.STICK); {
            ItemMeta meta = leggins.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Ten crafting jest zablokowany!");
            nogawice.setItemMeta(meta);
        }
        ItemStack enchant = new ItemStack((Material.ENCHANTING_TABLE)); {
            ItemMeta meta = enchant.getItemMeta();
            meta.setDisplayName(ChatColor.AQUA + "Enchant");
            enchant.setItemMeta(meta);
        }
        ItemStack eblock = new ItemStack((Material.STICK)); {
            ItemMeta meta = eblock.getItemMeta();
            meta.setDisplayName(ChatColor.RED + "Ten crafting jest zablokowany!");
            eblock.setItemMeta(meta);
        }

        ShapedRecipe hrecipe = new ShapedRecipe(helmet);
        hrecipe.shape("-A-", "- -", "   ");
        hrecipe.setIngredient('-', Material.DIAMOND);
        hrecipe.setIngredient('A', Material.DIAMOND_BLOCK);

        ShapedRecipe srecipe = new ShapedRecipe(sword);
        srecipe.shape("- -", "-A-", "---");
        srecipe.setIngredient('-', Material.DIAMOND);
        srecipe.setIngredient('A', Material.DIAMOND_BLOCK);

        ShapedRecipe lrecipe = new ShapedRecipe(leggins);
        lrecipe.shape("-A-", "- -", "- -");
        lrecipe.setIngredient('-', Material.DIAMOND);
        lrecipe.setIngredient('A', Material.DIAMOND_BLOCK);

        ShapedRecipe nblock = new ShapedRecipe(napiersnik);
        nblock.shape("- -", "---", "---");
        nblock.setIngredient('-', Material.DIAMOND);

        ShapedRecipe hblock = new ShapedRecipe(helm);
        hblock.shape("---", "- -", "   ");
        hblock.setIngredient('-', Material.DIAMOND);

        ShapedRecipe noblock = new ShapedRecipe(nogawice);
        noblock.shape("---", "- -", "- -");
        noblock.setIngredient('-', Material.DIAMOND);


        ShapedRecipe erecipe = new ShapedRecipe(enchant);
        erecipe.shape(" - ", "+=+", "===");
        erecipe.setIngredient('=', Material.OBSIDIAN);
        erecipe.setIngredient('-', Material.BOOK);
        erecipe.setIngredient('+', Material.DIAMOND_BLOCK);

        ShapedRecipe enblock = new ShapedRecipe(eblock);
        enblock.shape(" - ", "+=+", "===");
        enblock.setIngredient('=', Material.OBSIDIAN);
        enblock.setIngredient('-', Material.BOOK);
        enblock.setIngredient('+', Material.DIAMOND);


        Bukkit.addRecipe(hrecipe);
        Bukkit.addRecipe(srecipe);
        Bukkit.addRecipe(lrecipe);

        Bukkit.addRecipe(nblock);
        Bukkit.addRecipe(hblock);
        Bukkit.addRecipe(noblock);

        Bukkit.addRecipe(erecipe);
        Bukkit.addRecipe(enblock);
    }

}