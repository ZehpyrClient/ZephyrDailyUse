package com.zephyr.dailyuse;

import com.zephyr.client.api.ZephyrAddon;
import com.zephyr.client.api.ZephyrApi;
import com.zephyr.client.configplusgui.keybind.Keybind;
import com.zephyr.client.configplusgui.module.Module;
import com.zephyr.client.commands.ZCommand;

import com.zephyr.client.module.disable.disableAxeStripping;
import com.zephyr.client.module.disable.disableBlockBreakingParticles;
import com.zephyr.client.module.disable.disableDeadMobInteraction;
import com.zephyr.client.module.disable.disableDeadMobRendering;
import com.zephyr.client.module.disable.disableFirstPersonEffectParticles;
import com.zephyr.client.module.disable.disableFluidFog;
import com.zephyr.client.module.disable.disableFogRendering;
import com.zephyr.client.module.disable.disableNauseaOverlay;
import com.zephyr.client.module.disable.disableNetherPortalSound;
import com.zephyr.client.module.disable.disablePortalGuiClosing;
import com.zephyr.client.module.disable.disableRainEffects;
import com.zephyr.client.module.disable.disableShovelPathing;
import com.zephyr.client.module.disable.disableDamageTilt;
import com.zephyr.client.module.disable.disableExplosionParticles;
import com.zephyr.client.module.disable.disableParticles;
import com.zephyr.client.module.qol.AppleSkin;
import com.zephyr.client.module.qol.ArmorRenderer;
import com.zephyr.client.module.qol.FullBright;
import com.zephyr.client.module.qol.InventoryRenderer;
import com.zephyr.client.module.qol.KeybindFix;
import com.zephyr.client.module.qol.RenderInvisibility;
import com.zephyr.client.module.qol.Seedcracker;
import com.zephyr.client.module.qol.ShulkerBoxTooltip;
import com.zephyr.client.module.qol.Xray;
import com.zephyr.client.module.qol.MouseTweaks;
import com.zephyr.client.module.qol.AuraMap;
import com.zephyr.client.module.combat.LungeSwap;
import com.zephyr.client.module.qol.FreeCam;
import com.zephyr.client.module.qol.Sneak;

public final class ZephyrDailyUseAddon implements ZephyrAddon {
    @Override
    public void onInitializeZephyr() {
        Module[] modules = new Module[] {
            disableAxeStripping.INSTANCE,
            disableBlockBreakingParticles.INSTANCE,
            disableDeadMobInteraction.INSTANCE,
            disableDeadMobRendering.INSTANCE,
            disableFirstPersonEffectParticles.INSTANCE,
            disableFluidFog.INSTANCE,
            disableFogRendering.INSTANCE,
            disableNauseaOverlay.INSTANCE,
            disableNetherPortalSound.INSTANCE,
            disablePortalGuiClosing.INSTANCE,
            disableRainEffects.INSTANCE,
            disableShovelPathing.INSTANCE,
            disableDamageTilt.INSTANCE,
            disableExplosionParticles.INSTANCE,
            disableParticles.INSTANCE,
            AppleSkin.INSTANCE,
            ArmorRenderer.INSTANCE,
            FullBright.INSTANCE,
            InventoryRenderer.INSTANCE,
            KeybindFix.INSTANCE,
            RenderInvisibility.INSTANCE,
            Seedcracker.INSTANCE,
            ShulkerBoxTooltip.INSTANCE,
            Xray.INSTANCE,
            MouseTweaks.INSTANCE,
            AuraMap.INSTANCE,
            LungeSwap.INSTANCE,
            FreeCam.INSTANCE,
            Sneak.INSTANCE
        };

        for (Module module : modules) {
            ZephyrApi.registerModule(module);
        }

        ZephyrApi.registerCommand(ZCommand.INSTANCE);

        String[] enabled = new String[] {
            "Disable Axe Stripping",
            "Disable Block Particles",
            "Disable Dead Mob Interaction",
            "Disable Dead Mob Rendering",
            "Disable First-Person Particles",
            "Disable Fluid Fog",
            "Disable Fog",
            "Disable Nausea",
            "Disable Portal GUI Closing",
            "Disable Portal Sound",
            "Disable Rain",
            "Disable Shovel Pathing",
            "Disable Damage Tilt",
            "Disable Explosion Particles",
            "Disable Particles",
            "AppleSkin",
            "ArmorRenderer",
            "FullBright",
            "InventoryRenderer",
            "Keybind Fix",
            "Render Invisibility",
            "Seedcracker",
            "ShulkerBoxTooltip",
            "Xray",
            "Mouse Tweaks",
            "AuraMap",
            "Lunge Swap"
        };
        for (String name : enabled) {
            ZephyrApi.setEnabled(name, true);
        }

        ZephyrApi.setKeybind("FreeCam", new Keybind(5, -1, -1));
        ZephyrApi.setKeybind("Sneak", new Keybind(15, 225, -1));
        ZephyrApi.setKeybind("Lunge Swap", new Keybind(53, -1, -1));
    }
}
