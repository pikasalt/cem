package net.dorianpb.cem.external.renderers;

import net.dorianpb.cem.external.models.cemArmorStandModel;
import net.dorianpb.cem.internal.cemFairy;
import net.dorianpb.cem.internal.cemModelRegistry;
import net.dorianpb.cem.internal.cemRenderer;
import net.minecraft.client.render.entity.ArmorStandEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.model.ArmorStandArmorEntityModel;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.util.Identifier;

public class cemArmorStandRenderer extends ArmorStandEntityRenderer implements cemRenderer{
    private final ArmorStandArmorEntityModel vanilla;
    private final String id;
    private cemModelRegistry registry;

    public cemArmorStandRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher);
        this.id="armor_stand";
        cemFairy.addRenderer(this,id);
        this.vanilla = this.model;
    }

    @Override
    public void restoreModel() {
        this.model = this.vanilla;
        this.registry = null;
    }

    @Override
    public void apply(cemModelRegistry registry) {
        this.registry = registry;
        try{
            this.model = new cemArmorStandModel(0.0F, registry);
        }
        catch(Exception e){
            modelError(e);
        }
    }

    @Override
    public String getId() {
        return this.id;
    }
    
    
    @Override
    public Identifier getTexture(ArmorStandEntity armorStandEntity){
        if(this.registry!=null && this.registry.hasTexture()){
            return this.registry.getTexture();
        }
        return super.getTexture(armorStandEntity);
    }
}