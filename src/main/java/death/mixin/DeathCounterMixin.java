package death.mixin;

import death.DeathCounter;
import net.minecraft.entity.player.PlayerEntity;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(PlayerEntity.class)
public abstract class DeathCounterMixin {
	private static final Logger log = LoggerFactory.getLogger(DeathCounter.MOD_ID);
	@Inject(at = @At("TAIL"), method = "onDeath")
	private void init(CallbackInfo info) {
		log.info("Owwwwwwwwwwww");
	}
}