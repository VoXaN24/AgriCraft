package com.InfinityRaider.AgriCraft.renderers.particles;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class DustFX extends AgriCraftFX {
    public DustFX(World world, double x, double y, double z, float scale, float gravity, Vec3 vector, ResourceLocation texture) {
        super(world, x, y, z, scale, gravity, vector, texture);
        this.particleMaxAge = 50;
        this.setSize(0.2f, 0.2f);
        this.noClip = true;
    }
}
