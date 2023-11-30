package Kaguya.PacketSource;
import java.util.ArrayList;

public class PacketType {
    public static void AbilityInvokeArguments(){
        ArrayList ListAbility = new ArrayList();

    }
    ArrayList List = new ArrayList();
    public void CombatTypeArguments(){
        ArrayList ListCombat = new ArrayList();
        ListCombat.add(1,"EvtBeingHitInfo");// COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT = 1;
        ListCombat.add(2,"EvtAnimatorStateChangedInfo");// COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED = 2;
        ListCombat.add(3,"EvtFaceToDirInfo");// COMBAT_TYPE_ARGUMENT_FACE_TO_DIR = 3;
        ListCombat.add(4,"EvtSetAttackTargetInfo");// COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET = 4;
        ListCombat.add(5,"EvtRushMoveInfo");// COMBAT_TYPE_ARGUMENT_RUSH_MOVE = 5;
        ListCombat.add(6,"EvtAnimatorParameterInfo");// COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED = 6;
        ListCombat.add(7,"EntityMoveInfo");// COMBAT_TYPE_ARGUMENT_ENTITY_MOVE = 7;
        ListCombat.add(8,"EvtSyncEntityPositionInfo");// COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION = 8;
        ListCombat.add(9,"EvtCombatSteerMotionInfo");// COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO = 9;
        ListCombat.add(10,"EvtCombatForceSetPosInfo");// COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO = 10;
        ListCombat.add(11,"EvtCompensatePosDiffInfo");// COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF = 11;
        ListCombat.add(12,"EvtMonsterDoBlink");// COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK = 12;
        ListCombat.add(13,"EvtFixedRushMove");// COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE = 13;
        ListCombat.add(14,"EvtSyncTransform");// COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM = 14;
        ListCombat.add(15,"EvtLightCoreMove");// COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE = 15;
        ListCombat.add(16,"EvtBeingHealedNotify");// COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF = 16;
        ListCombat.add(17,"EvtSyncSkillAnchorPosition");// COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF = 17;
        ListCombat.add(18,"EvtGrapplingHookMove");// COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE = 18;
        ListCombat.add(19,"");
        ListCombat = this.List;
    }
}
