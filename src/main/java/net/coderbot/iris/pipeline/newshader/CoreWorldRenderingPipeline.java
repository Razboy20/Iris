package net.coderbot.iris.pipeline.newshader;

import net.coderbot.iris.pipeline.WorldRenderingPipeline;
import net.coderbot.iris.uniforms.FrameUpdateNotifier;
import net.minecraft.client.render.Shader;

public interface CoreWorldRenderingPipeline extends WorldRenderingPipeline {
	Shader getBasic();
	Shader getBasicColor();
	// TODO: Shader getShadowBasic();
	// TODO: Shader getShadowBasicColor();
	Shader getTextured();
	Shader getTexturedColor();
	// TODO: Shader getShadowTextured();
	// TODO: Shader getShadowTexturedColor();

	Shader getSkyBasic();
	Shader getSkyBasicColor();
	Shader getSkyTextured();
	Shader getSkyTexturedColor();
	Shader getClouds();
	Shader getTerrain();
	Shader getTerrainCutout();
	Shader getTerrainCutoutMipped();
	Shader getEntitiesSolid();
	Shader getEntitiesCutout();
	Shader getEntitiesEyes();
	Shader getLeash();
	Shader getLightning();
	Shader getParticles();
	Shader getWeather();
	Shader getCrumbling();
	Shader getText();
	Shader getBlock();
	Shader getBeacon();
	Shader getShadowTerrainCutout();
	Shader getShadowEntitiesCutout();
	Shader getShadowBeaconBeam();
	Shader getTranslucent();
	Shader getGlint();
	Shader getLines();
	Shader getShadowLines();
	WorldRenderingPhase getPhase();
	FrameUpdateNotifier getUpdateNotifier();
	void destroy();
}
