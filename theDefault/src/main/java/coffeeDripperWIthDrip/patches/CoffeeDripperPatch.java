package coffeeDripperWIthDrip.patches;

import basemod.ReflectionHacks;
import coffeeDripperWIthDrip.CoffeDripperWithDrip;
import com.evacipated.cardcrawl.modthespire.lib.ByRef;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch2;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import com.megacrit.cardcrawl.relics.CoffeeDripper;
import com.megacrit.cardcrawl.screens.SingleRelicViewPopup;

import java.util.Objects;

public class CoffeeDripperPatch {

    @SpirePatch2(clz = ImageMaster.class, method = "loadImage", paramtypez = {String.class})
    public static class ImageReplacer{
        public static void Prefix(@ByRef String[] imgUrl){
            if(imgUrl == null || imgUrl.length < 1 || imgUrl[0] == null) return;

            if(imgUrl[0].equals("images/relics/coffeeDripper.png")){
                imgUrl[0] = "coffeeDripperWithDripResources/images/relics/coffee_dripper.png";
            }
            if(imgUrl[0].equals("images/relics/outline/coffeeDripper.png")){
                imgUrl[0] = "coffeeDripperWithDripResources/images/relics/outline/coffee_dripper.png";
            }
            if(imgUrl[0].equals("images/largeRelics/coffeeDripper.png")){
                imgUrl[0] = "coffeeDripperWithDripResources/images/relics/coffee_dripper_large.png";
            }
        }
    }
}
