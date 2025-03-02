package com.chimericdream.lib.mixin;

import com.chimericdream.lib.tags.CommonBlockTags;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.ShearsItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(ShearsItem.class)
public class ShearsItemMixin {
    @Inject(
        method = "createToolComponent()Lnet/minecraft/component/type/ToolComponent;",
        at = @At(value = "RETURN"),
        cancellable = true
    )
    private static void addBlocksToRuleList(CallbackInfoReturnable<ToolComponent> cir) {
        ToolComponent original = cir.getReturnValue();

        List<ToolComponent.Rule> rules = new ArrayList<>(original.rules());
        rules.add(ToolComponent.Rule.of(CommonBlockTags.SHEARS_MINEABLE, 5.0F));

        cir.setReturnValue(new ToolComponent(rules, original.defaultMiningSpeed(), original.damagePerBlock()));
    }
}
