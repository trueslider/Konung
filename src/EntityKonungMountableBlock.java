package net.minecraft.src;
/* вз€то из Seatable Chairs 1.3 by ITOS*/
public class EntityKonungMountableBlock extends Entity
{
        //Ёти переменные отслеживает блок, который создал объект
        protected int orgBlockPosX;
        protected int orgBlockPosY;
        protected int orgBlockPosZ;
        protected int orgBlockID;
        public EntityKonungMountableBlock(World world)
        {
                super(world);
        }
        //This constructor seems to be required by ModLoaderMp.
        public EntityKonungMountableBlock(World world, double d, double d1, double d2)
        {
                super(world);
                noClip = true;
                preventEntitySpawning = true;
                width = 0.0F;
                height = 0.0F;
                setPosition(d, d1, d2);
        }
        //Ётот конструктор вызывает MountableBlock
        public EntityKonungMountableBlock(World world, EntityPlayer entityplayer, int i, int j, int k, float mountingX, float mountingY, float mountingZ)
        {
                super(world);
                noClip = true;
                preventEntitySpawning = true;
                width = 0.0F;
                height = 0.0F;
                orgBlockPosX = i;
                orgBlockPosY = j;
                orgBlockPosZ = k;
                orgBlockID = world.getBlockId(i, j, k);
                setPosition(mountingX, mountingY, mountingZ);
        }
        //Ётот метод обрабатывает монтаж и демонтаж.
        public boolean interact(EntityPlayer entityplayer)
        {
                if (!super.interact(entityplayer))
                {
                        if (!worldObj.isRemote && (riddenByEntity == null || riddenByEntity == entityplayer))
                        {
                                entityplayer.mountEntity(this);
                                return true;
                        }
                        else
                        {
                                return false;
                        }
                }
                else
                {
                        return true;
                }
        }
        //The following methods are for most parts redundant, simplified versions of those in Entity but they also delete unused EMBs.
        public void onUpdate()
        {
                onEntityUpdate();
        }
        public void onEntityUpdate()
        {
                Profiler.startSection("entityBaseTick");
                if (riddenByEntity == null || riddenByEntity.isDead)
                {
                        setDead();
                }
                else if (worldObj.getBlockId(orgBlockPosX, orgBlockPosY, orgBlockPosZ) != orgBlockID)
                {
                        interact((EntityPlayer) riddenByEntity);
                }
                ticksExisted++;
                Profiler.endSection();
        }
        //—ледующие методы требуют Entity класса, но € не знаю, дл€ чего они нужны:D
        public void entityInit() {}
        public void readEntityFromNBT(NBTTagCompound nbttagcompound) {}
        public void writeEntityToNBT(NBTTagCompound nbttagcompound) {}
}
