package death.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class ExampleMixin {


	@Inject(at = @At("TAIL"), method = "onDeath")
	private void init(CallbackInfo info) {
		MinecraftClient.getInstance().player.sendMessage(Text.literal("Owwwwww"));
	}
}