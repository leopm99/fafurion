/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package quests;

import java.util.logging.Level;
import java.util.logging.Logger;

import quests.Q00013_ParcelDelivery.Q00013_ParcelDelivery;
import quests.Q00015_SweetWhispers.Q00015_SweetWhispers;
import quests.Q00016_TheComingDarkness.Q00016_TheComingDarkness;
import quests.Q00017_LightAndDarkness.Q00017_LightAndDarkness;
import quests.Q00031_SecretBuriedInTheSwamp.Q00031_SecretBuriedInTheSwamp;
import quests.Q00032_AnObviousLie.Q00032_AnObviousLie;
import quests.Q00033_MakeAPairOfDressShoes.Q00033_MakeAPairOfDressShoes;
import quests.Q00035_FindGlitteringJewelry.Q00035_FindGlitteringJewelry;
import quests.Q00036_MakeASewingKit.Q00036_MakeASewingKit;
import quests.Q00037_MakeFormalWear.Q00037_MakeFormalWear;
import quests.Q00040_ASpecialOrder.Q00040_ASpecialOrder;
import quests.Q00042_HelpTheUncle.Q00042_HelpTheUncle;
import quests.Q00043_HelpTheSister.Q00043_HelpTheSister;
import quests.Q00044_HelpTheSon.Q00044_HelpTheSon;
import quests.Q00061_LawEnforcement.Q00061_LawEnforcement;
import quests.Q00115_TheOtherSideOfTruth.Q00115_TheOtherSideOfTruth;
import quests.Q00119_LastImperialPrince.Q00119_LastImperialPrince;
import quests.Q00128_PailakaSongOfIceAndFire.Q00128_PailakaSongOfIceAndFire;
import quests.Q00129_PailakaDevilsLegacy.Q00129_PailakaDevilsLegacy;
import quests.Q00134_TempleMissionary.Q00134_TempleMissionary;
import quests.Q00135_TempleExecutor.Q00135_TempleExecutor;
import quests.Q00136_MoreThanMeetsTheEye.Q00136_MoreThanMeetsTheEye;
import quests.Q00137_TempleChampionPart1.Q00137_TempleChampionPart1;
import quests.Q00138_TempleChampionPart2.Q00138_TempleChampionPart2;
import quests.Q00139_ShadowFoxPart1.Q00139_ShadowFoxPart1;
import quests.Q00140_ShadowFoxPart2.Q00140_ShadowFoxPart2;
import quests.Q00141_ShadowFoxPart3.Q00141_ShadowFoxPart3;
import quests.Q00142_FallenAngelRequestOfDawn.Q00142_FallenAngelRequestOfDawn;
import quests.Q00143_FallenAngelRequestOfDusk.Q00143_FallenAngelRequestOfDusk;
import quests.Q00144_PailakaInjuredDragon.Q00144_PailakaInjuredDragon;
import quests.Q00149_PrimalMotherIstina.Q00149_PrimalMotherIstina;
import quests.Q00150_ExtremeChallengePrimalMotherResurrected.Q00150_ExtremeChallengePrimalMotherResurrected;
import quests.Q00177_SplitDestiny.Q00177_SplitDestiny;
import quests.Q00180_InfernalFlamesBurningInCrystalPrison.Q00180_InfernalFlamesBurningInCrystalPrison;
import quests.Q00181_DevilsStrikeBackAdventOfBalok.Q00181_DevilsStrikeBackAdventOfBalok;
import quests.Q00183_RelicExploration.Q00183_RelicExploration;
import quests.Q00184_ArtOfPersuasion.Q00184_ArtOfPersuasion;
import quests.Q00185_NikolasCooperation.Q00185_NikolasCooperation;
import quests.Q00186_ContractExecution.Q00186_ContractExecution;
import quests.Q00187_NikolasHeart.Q00187_NikolasHeart;
import quests.Q00188_SealRemoval.Q00188_SealRemoval;
import quests.Q00189_ContractCompletion.Q00189_ContractCompletion;
import quests.Q00190_LostDream.Q00190_LostDream;
import quests.Q00191_VainConclusion.Q00191_VainConclusion;
import quests.Q00192_SevenSignsSeriesOfDoubt.Q00192_SevenSignsSeriesOfDoubt;
import quests.Q00193_SevenSignsDyingMessage.Q00193_SevenSignsDyingMessage;
import quests.Q00194_SevenSignsMammonsContract.Q00194_SevenSignsMammonsContract;
import quests.Q00195_SevenSignsSecretRitualOfThePriests.Q00195_SevenSignsSecretRitualOfThePriests;
import quests.Q00196_SevenSignsSealOfTheEmperor.Q00196_SevenSignsSealOfTheEmperor;
import quests.Q00197_SevenSignsTheSacredBookOfSeal.Q00197_SevenSignsTheSacredBookOfSeal;
import quests.Q00198_SevenSignsEmbryo.Q00198_SevenSignsEmbryo;
import quests.Q00210_ObtainAWolfPet.Q00210_ObtainAWolfPet;
import quests.Q00254_LegendaryTales.Q00254_LegendaryTales;
import quests.Q00337_AudienceWithTheLandDragon.Q00337_AudienceWithTheLandDragon;
import quests.Q00344_1000YearsTheEndOfLamentation.Q00344_1000YearsTheEndOfLamentation;
import quests.Q00371_ShrieksOfGhosts.Q00371_ShrieksOfGhosts;
import quests.Q00386_StolenDignity.Q00386_StolenDignity;
import quests.Q00420_LittleWing.Q00420_LittleWing;
import quests.Q00421_LittleWingsBigAdventure.Q00421_LittleWingsBigAdventure;
import quests.Q00450_GraveRobberRescue.Q00450_GraveRobberRescue;
import quests.Q00451_LuciensAltar.Q00451_LuciensAltar;
import quests.Q00452_FindingtheLostSoldiers.Q00452_FindingtheLostSoldiers;
import quests.Q00453_NotStrongEnoughAlone.Q00453_NotStrongEnoughAlone;
import quests.Q00454_CompletelyLost.Q00454_CompletelyLost;
import quests.Q00455_WingsOfSand.Q00455_WingsOfSand;
import quests.Q00456_DontKnowDontCare.Q00456_DontKnowDontCare;
import quests.Q00459_TheVillainOfTheUndergroundMineTeredor.Q00459_TheVillainOfTheUndergroundMineTeredor;
import quests.Q00460_PreciousResearchMaterial.Q00460_PreciousResearchMaterial;
import quests.Q00462_StuffedAncientHeroes.Q00462_StuffedAncientHeroes;
import quests.Q00465_WeAreFriends.Q00465_WeAreFriends;
import quests.Q00466_PlacingMySmallPower.Q00466_PlacingMySmallPower;
import quests.Q00468_BeLostInTheMysteriousScent.Q00468_BeLostInTheMysteriousScent;
import quests.Q00469_SuspiciousGardener.Q00469_SuspiciousGardener;
import quests.Q00470_DivinityProtector.Q00470_DivinityProtector;
import quests.Q00471_BreakingThroughTheEmeraldSquare.Q00471_BreakingThroughTheEmeraldSquare;
import quests.Q00472_ChallengeSteamCorridor.Q00472_ChallengeSteamCorridor;
import quests.Q00473_InTheCoralGarden.Q00473_InTheCoralGarden;
import quests.Q00474_WaitingForTheSummer.Q00474_WaitingForTheSummer;
import quests.Q00476_PlainMission.Q00476_PlainMission;
import quests.Q00482_RecertificationOfValue.Q00482_RecertificationOfValue;
import quests.Q00483_IntendedTactic.Q00483_IntendedTactic;
import quests.Q00485_HotSpringWater.Q00485_HotSpringWater;
import quests.Q00492_TombRaiders.Q00492_TombRaiders;
import quests.Q00493_KickingOutUnwelcomeGuests.Q00493_KickingOutUnwelcomeGuests;
import quests.Q00494_IncarnationOfGreedZellakaGroup.Q00494_IncarnationOfGreedZellakaGroup;
import quests.Q00495_IncarnationOfJealousyPellineGroup.Q00495_IncarnationOfJealousyPellineGroup;
import quests.Q00496_IncarnationOfGluttonyKaliosGroup.Q00496_IncarnationOfGluttonyKaliosGroup;
import quests.Q00497_IncarnationOfGreedZellakaSolo.Q00497_IncarnationOfGreedZellakaSolo;
import quests.Q00498_IncarnationOfJealousyPellineSolo.Q00498_IncarnationOfJealousyPellineSolo;
import quests.Q00499_IncarnationOfGluttonyKaliosSolo.Q00499_IncarnationOfGluttonyKaliosSolo;
import quests.Q00500_BrothersBoundInChains.Q00500_BrothersBoundInChains;
import quests.Q00511_AwlUnderFoot.Q00511_AwlUnderFoot;
import quests.Q00512_BladeUnderFoot.Q00512_BladeUnderFoot;
import quests.Q00551_OlympiadStarter.Q00551_OlympiadStarter;
import quests.Q00553_OlympiadUndefeated.Q00553_OlympiadUndefeated;
import quests.Q00561_BasicMissionHarnakUndergroundRuins.Q00561_BasicMissionHarnakUndergroundRuins;
import quests.Q00562_BasicMissionAltarOfEvil.Q00562_BasicMissionAltarOfEvil;
import quests.Q00563_BasicMissionBloodySwampland.Q00563_BasicMissionBloodySwampland;
import quests.Q00564_BasicMissionKartiasLabyrinthSolo.Q00564_BasicMissionKartiasLabyrinthSolo;
import quests.Q00580_BeyondTheMemories.Q00580_BeyondTheMemories;
import quests.Q00581_ThePurificationRitual.Q00581_ThePurificationRitual;
import quests.Q00582_WashBloodWithBlood.Q00582_WashBloodWithBlood;
import quests.Q00583_MeaningOfSurvival.Q00583_MeaningOfSurvival;
import quests.Q00584_NeverSayGoodBye.Q00584_NeverSayGoodBye;
import quests.Q00617_GatherTheFlames.Q00617_GatherTheFlames;
import quests.Q00618_IntoTheFlame.Q00618_IntoTheFlame;
import quests.Q00620_FourGoblets.Q00620_FourGoblets;
import quests.Q00621_EggDelivery.Q00621_EggDelivery;
import quests.Q00622_SpecialtyLiquorDelivery.Q00622_SpecialtyLiquorDelivery;
import quests.Q00623_TheFinestFood.Q00623_TheFinestFood;
import quests.Q00627_HeartInSearchOfPower.Q00627_HeartInSearchOfPower;
import quests.Q00648_AnIceMerchantsDream.Q00648_AnIceMerchantsDream;
import quests.Q00662_AGameOfCards.Q00662_AGameOfCards;
import quests.Q00663_SeductiveWhispers.Q00663_SeductiveWhispers;
import quests.Q00670_DefeatingTheLordOfSeed.Q00670_DefeatingTheLordOfSeed;
import quests.Q00726_LightWithinTheDarkness.Q00726_LightWithinTheDarkness;
import quests.Q00727_HopeWithinTheDarkness.Q00727_HopeWithinTheDarkness;
import quests.Q00751_LiberatingTheSpirits.Q00751_LiberatingTheSpirits;
import quests.Q00752_UncoverTheSecret.Q00752_UncoverTheSecret;
import quests.Q00753_ReactingToACrisis.Q00753_ReactingToACrisis;
import quests.Q00754_AssistingTheRebelForces.Q00754_AssistingTheRebelForces;
import quests.Q00755_InNeedOfPetras.Q00755_InNeedOfPetras;
import quests.Q00756_TopQualityPetra.Q00756_TopQualityPetra;
import quests.Q00757_TriolsMovement.Q00757_TriolsMovement;
import quests.Q00758_TheFallenKingsMen.Q00758_TheFallenKingsMen;
import quests.Q00760_BlockTheExit.Q00760_BlockTheExit;
import quests.Q00761_AssistingTheGoldenRamArmy.Q00761_AssistingTheGoldenRamArmy;
import quests.Q00762_AnOminousRequest.Q00762_AnOminousRequest;
import quests.Q00763_ADauntingTask.Q00763_ADauntingTask;
import quests.Q00764_WeakeningTheVarkaSilenosForces.Q00764_WeakeningTheVarkaSilenosForces;
import quests.Q00765_WeakeningTheKetraOrcForces.Q00765_WeakeningTheKetraOrcForces;
import quests.Q00775_RetrievingTheChaosFragment.Q00775_RetrievingTheChaosFragment;
import quests.Q00776_SlayDarkLordEkimus.Q00776_SlayDarkLordEkimus;
import quests.Q00777_SlayDarkLordTiat.Q00777_SlayDarkLordTiat;
import quests.Q00778_OperationRoaringFlame.Q00778_OperationRoaringFlame;
import quests.Q00779_UtilizeTheDarknessSeedOfDestruction.Q00779_UtilizeTheDarknessSeedOfDestruction;
import quests.Q00783_VestigeOfTheMagicPower.Q00783_VestigeOfTheMagicPower;
import quests.Q00787_TheRoleOfAWatcher.Q00787_TheRoleOfAWatcher;
import quests.Q00790_ObtainingFerinsTrust.Q00790_ObtainingFerinsTrust;
import quests.Q00817_BlackAteliaResearch.Q00817_BlackAteliaResearch;
import quests.Q00823_DisappearedRaceNewFairy.Q00823_DisappearedRaceNewFairy;
import quests.Q00826_InSearchOfTheSecretWeapon.Q00826_InSearchOfTheSecretWeapon;
import quests.Q00827_EinhasadsOrder.Q00827_EinhasadsOrder;
import quests.Q00828_EvasBlessing.Q00828_EvasBlessing;
import quests.Q00829_MaphrsSalvation.Q00829_MaphrsSalvation;
import quests.Q00830_TheWayOfTheGiantsPawn.Q00830_TheWayOfTheGiantsPawn;
import quests.Q00831_SayhasScheme.Q00831_SayhasScheme;
import quests.Q00835_PitiableMelisa.Q00835_PitiableMelisa;
import quests.Q00901_HowLavasaurusesAreMade.Q00901_HowLavasaurusesAreMade;
import quests.Q00902_ReclaimOurEra.Q00902_ReclaimOurEra;
import quests.Q00903_TheCallOfAntharas.Q00903_TheCallOfAntharas;
import quests.Q00905_RefinedDragonBlood.Q00905_RefinedDragonBlood;
import quests.Q00906_TheCallOfValakas.Q00906_TheCallOfValakas;
import quests.Q00926_30DaySearchOperation.Q00926_30DaySearchOperation;
import quests.Q00928_100DaySubjugationOperation.Q00928_100DaySubjugationOperation;
import quests.Q00937_ToReviveTheFishingGuild.Q00937_ToReviveTheFishingGuild;
import quests.Q10282_ToTheSeedOfAnnihilation.Q10282_ToTheSeedOfAnnihilation;
import quests.Q10283_RequestOfIceMerchant.Q10283_RequestOfIceMerchant;
import quests.Q10284_AcquisitionOfDivineSword.Q10284_AcquisitionOfDivineSword;
import quests.Q10285_MeetingSirra.Q10285_MeetingSirra;
import quests.Q10286_ReunionWithSirra.Q10286_ReunionWithSirra;
import quests.Q10287_StoryOfThoseLeft.Q10287_StoryOfThoseLeft;
import quests.Q10290_LandDragonConqueror.Q10290_LandDragonConqueror;
import quests.Q10291_FireDragonDestroyer.Q10291_FireDragonDestroyer;
import quests.Q10292_SevenSignsGirlOfDoubt.Q10292_SevenSignsGirlOfDoubt;
import quests.Q10293_SevenSignsForbiddenBookOfTheElmoreAdenKingdom.Q10293_SevenSignsForbiddenBookOfTheElmoreAdenKingdom;
import quests.Q10294_SevenSignsToTheMonasteryOfSilence.Q10294_SevenSignsToTheMonasteryOfSilence;
import quests.Q10295_SevenSignsSolinasTomb.Q10295_SevenSignsSolinasTomb;
import quests.Q10296_SevenSignsOneWhoSeeksThePowerOfTheSeal.Q10296_SevenSignsOneWhoSeeksThePowerOfTheSeal;
import quests.Q10297_GrandOpeningComeToOurPub.Q10297_GrandOpeningComeToOurPub;
import quests.Q10301_ShadowOfTerrorBlackishRedFog.Q10301_ShadowOfTerrorBlackishRedFog;
import quests.Q10302_UnsettlingShadowAndRumors.Q10302_UnsettlingShadowAndRumors;
import quests.Q10303_CrossroadsBetweenLightAndDarkness.Q10303_CrossroadsBetweenLightAndDarkness;
import quests.Q10305_UnstoppableFutileEfforts.Q10305_UnstoppableFutileEfforts;
import quests.Q10306_TheCorruptedLeader.Q10306_TheCorruptedLeader;
import quests.Q10307_TheCorruptedLeaderHisTruth.Q10307_TheCorruptedLeaderHisTruth;
import quests.Q10310_TwistedCreationTree.Q10310_TwistedCreationTree;
import quests.Q10311_PeacefulDaysAreOver.Q10311_PeacefulDaysAreOver;
import quests.Q10312_AbandonedGodsCreature.Q10312_AbandonedGodsCreature;
import quests.Q10315_ToThePrisonOfDarkness.Q10315_ToThePrisonOfDarkness;
import quests.Q10316_UndecayingMemoryOfThePast.Q10316_UndecayingMemoryOfThePast;
import quests.Q10317_OrbisWitch.Q10317_OrbisWitch;
import quests.Q10318_DecayingDarkness.Q10318_DecayingDarkness;
import quests.Q10320_LetsGoToTheCentralSquare.Q10320_LetsGoToTheCentralSquare;
import quests.Q10321_QualificationsOfTheSeeker.Q10321_QualificationsOfTheSeeker;
import quests.Q10330_ToTheRuinsOfYeSagira.Q10330_ToTheRuinsOfYeSagira;
import quests.Q10331_StartOfFate.Q10331_StartOfFate;
import quests.Q10332_ToughRoad.Q10332_ToughRoad;
import quests.Q10333_DisappearedSakum.Q10333_DisappearedSakum;
import quests.Q10334_ReportingTheStatusOfTheWindmillHill.Q10334_ReportingTheStatusOfTheWindmillHill;
import quests.Q10335_RequestToFindSakum.Q10335_RequestToFindSakum;
import quests.Q10336_DividedSakumKanilov.Q10336_DividedSakumKanilov;
import quests.Q10337_SakumsImpact.Q10337_SakumsImpact;
import quests.Q10338_SeizeYourDestiny.Q10338_SeizeYourDestiny;
import quests.Q10341_DayOfDestinyHumansFate.Q10341_DayOfDestinyHumansFate;
import quests.Q10342_DayOfDestinyElvenFate.Q10342_DayOfDestinyElvenFate;
import quests.Q10343_DayOfDestinyDarkElfsFate.Q10343_DayOfDestinyDarkElfsFate;
import quests.Q10344_DayOfDestinyOrcsFate.Q10344_DayOfDestinyOrcsFate;
import quests.Q10345_DayOfDestinyDwarfsFate.Q10345_DayOfDestinyDwarfsFate;
import quests.Q10346_DayOfDestinyKamaelsFate.Q10346_DayOfDestinyKamaelsFate;
import quests.Q10351_OwnerOfHall.Q10351_OwnerOfHall;
import quests.Q10353_CertificationOfValue.Q10353_CertificationOfValue;
import quests.Q10354_ResurrectedOwnerOfHall.Q10354_ResurrectedOwnerOfHall;
import quests.Q10358_DividedSakumPoslof.Q10358_DividedSakumPoslof;
import quests.Q10359_TracesOfEvil.Q10359_TracesOfEvil;
import quests.Q10360_CertificationOfFate.Q10360_CertificationOfFate;
import quests.Q10362_CertificationOfTheSeeker.Q10362_CertificationOfTheSeeker;
import quests.Q10363_RequestOfTheSeeker.Q10363_RequestOfTheSeeker;
import quests.Q10364_ObligationsOfTheSeeker.Q10364_ObligationsOfTheSeeker;
import quests.Q10365_ForTheSearchdogKing.Q10365_ForTheSearchdogKing;
import quests.Q10366_ReportOnTheSituationAtTheRuins.Q10366_ReportOnTheSituationAtTheRuins;
import quests.Q10369_NoblesseSoulTesting.Q10369_NoblesseSoulTesting;
import quests.Q10377_TheInvadedExecutionGrounds.Q10377_TheInvadedExecutionGrounds;
import quests.Q10378_WeedingWork.Q10378_WeedingWork;
import quests.Q10379_AnUninvitedGuest.Q10379_AnUninvitedGuest;
import quests.Q10380_TheExecutionersExecution.Q10380_TheExecutionersExecution;
import quests.Q10381_ToTheSeedOfHellfire.Q10381_ToTheSeedOfHellfire;
import quests.Q10382_DayOfLiberation.Q10382_DayOfLiberation;
import quests.Q10383_FergasonsOffer.Q10383_FergasonsOffer;
import quests.Q10384_AnAudienceWithTauti.Q10384_AnAudienceWithTauti;
import quests.Q10385_RedThreadOfFate.Q10385_RedThreadOfFate;
import quests.Q10386_MysteriousJourney.Q10386_MysteriousJourney;
import quests.Q10387_SoullessOne.Q10387_SoullessOne;
import quests.Q10388_ConspiracyBehindDoor.Q10388_ConspiracyBehindDoor;
import quests.Q10389_TheVoiceOfAuthority.Q10389_TheVoiceOfAuthority;
import quests.Q10390_KekropusLetter.Q10390_KekropusLetter;
import quests.Q10391_ASuspiciousHelper.Q10391_ASuspiciousHelper;
import quests.Q10392_FailureAndItsConsequences.Q10392_FailureAndItsConsequences;
import quests.Q10393_KekropusLetterAClueCompleted.Q10393_KekropusLetterAClueCompleted;
import quests.Q10394_MutualBenefit.Q10394_MutualBenefit;
import quests.Q10395_NotATraitor.Q10395_NotATraitor;
import quests.Q10401_KekropusLetterDecodingTheBadge.Q10401_KekropusLetterDecodingTheBadge;
import quests.Q10402_NowhereToTurn.Q10402_NowhereToTurn;
import quests.Q10403_TheGuardianGiant.Q10403_TheGuardianGiant;
import quests.Q10404_KekropusLetterAHiddenMeaning.Q10404_KekropusLetterAHiddenMeaning;
import quests.Q10405_KartiasSeed.Q10405_KartiasSeed;
import quests.Q10406_BeforeDarknessBearsFruit.Q10406_BeforeDarknessBearsFruit;
import quests.Q10408_KekropusLetterTheSwampOfScreams.Q10408_KekropusLetterTheSwampOfScreams;
import quests.Q10409_ASuspiciousVagabondInTheSwamp.Q10409_ASuspiciousVagabondInTheSwamp;
import quests.Q10410_EmbryoInTheSwampOfScreams.Q10410_EmbryoInTheSwampOfScreams;
import quests.Q10411_KekropusLetterTheForestOfTheDead.Q10411_KekropusLetterTheForestOfTheDead;
import quests.Q10412_ASuspiciousVagabondInTheForest.Q10412_ASuspiciousVagabondInTheForest;
import quests.Q10413_EmbryoInTheForestOfTheDead.Q10413_EmbryoInTheForestOfTheDead;
import quests.Q10414_KekropusLetterWithCourage.Q10414_KekropusLetterWithCourage;
import quests.Q10415_KekropusLetterWithWisdom.Q10415_KekropusLetterWithWisdom;
import quests.Q10416_InSearchOfTheEyeOfArgos.Q10416_InSearchOfTheEyeOfArgos;
import quests.Q10417_DaimonTheWhiteEyed.Q10417_DaimonTheWhiteEyed;
import quests.Q10419_KekropusLetterKampfsWhereabouts.Q10419_KekropusLetterKampfsWhereabouts;
import quests.Q10420_TheVarkaSilenosSupporters.Q10420_TheVarkaSilenosSupporters;
import quests.Q10421_AssassinationOfTheVarkaSilenosCommander.Q10421_AssassinationOfTheVarkaSilenosCommander;
import quests.Q10422_AssassinationOfTheVarkaSilenosChief.Q10422_AssassinationOfTheVarkaSilenosChief;
import quests.Q10424_KekropusLetterBelosWhereabouts.Q10424_KekropusLetterBelosWhereabouts;
import quests.Q10425_TheKetraOrcSupporters.Q10425_TheKetraOrcSupporters;
import quests.Q10426_AssassinationOfTheKetraOrcCommander.Q10426_AssassinationOfTheKetraOrcCommander;
import quests.Q10427_AssassinationOfTheKetraOrcChief.Q10427_AssassinationOfTheKetraOrcChief;
import quests.Q10445_AnImpendingThreat.Q10445_AnImpendingThreat;
import quests.Q10446_HitAndRun.Q10446_HitAndRun;
import quests.Q10447_TimingIsEverything.Q10447_TimingIsEverything;
import quests.Q10450_ADarkAmbition.Q10450_ADarkAmbition;
import quests.Q10453_StoppingTheWindDragon.Q10453_StoppingTheWindDragon;
import quests.Q10455_ElikiasLetter.Q10455_ElikiasLetter;
import quests.Q10456_OperationRescue.Q10456_OperationRescue;
import quests.Q10459_ASickAmbition.Q10459_ASickAmbition;
import quests.Q10460_ReturnOfTheAlligatorHunter.Q10460_ReturnOfTheAlligatorHunter;
import quests.Q10472_WindsOfFateEncroachingShadows.Q10472_WindsOfFateEncroachingShadows;
import quests.Q10501_ZakenEmbroideredSoulCloak.Q10501_ZakenEmbroideredSoulCloak;
import quests.Q10502_FreyaEmbroideredSoulCloak.Q10502_FreyaEmbroideredSoulCloak;
import quests.Q10503_FrintezzaEmbroideredSoulCloak.Q10503_FrintezzaEmbroideredSoulCloak;
import quests.Q10504_JewelOfAntharas.Q10504_JewelOfAntharas;
import quests.Q10505_JewelOfValakas.Q10505_JewelOfValakas;
import quests.Q10521_QueenNavarisLetterVarkaSilenosBarracks.Q10521_QueenNavarisLetterVarkaSilenosBarracks;
import quests.Q10522_TheDarkSecretOfVarkaSilenos.Q10522_TheDarkSecretOfVarkaSilenos;
import quests.Q10523_TheAssassinationOfTheVarkaSilenosCommander.Q10523_TheAssassinationOfTheVarkaSilenosCommander;
import quests.Q10524_TheAssassinationOfTheVarkaSilenosCommanderChief.Q10524_TheAssassinationOfTheVarkaSilenosCommanderChief;
import quests.Q10525_QueenNavarisLetterKetraOrcOutpost.Q10525_QueenNavarisLetterKetraOrcOutpost;
import quests.Q10526_TheDarkSecretOfTheKetraOrcs.Q10526_TheDarkSecretOfTheKetraOrcs;
import quests.Q10527_TheAssassinationOfTheKetraOrcCommander.Q10527_TheAssassinationOfTheKetraOrcCommander;
import quests.Q10528_TheAssassinationOfTheKetraOrcChief.Q10528_TheAssassinationOfTheKetraOrcChief;
import quests.Q10530_KekropusLetterTheDragonsTransition.Q10530_KekropusLetterTheDragonsTransition;
import quests.Q10534_HatchlingResearch.Q10534_HatchlingResearch;
import quests.Q10541_TrainLikeTheRealThing.Q10541_TrainLikeTheRealThing;
import quests.Q10542_SearchingForNewPower.Q10542_SearchingForNewPower;
import quests.Q10543_SheddingWeight.Q10543_SheddingWeight;
import quests.Q10544_SeekerSupplies.Q10544_SeekerSupplies;
import quests.Q10560_WayOfWanderingKnight.Q10560_WayOfWanderingKnight;
import quests.Q10561_AcrossTheDeathLine.Q10561_AcrossTheDeathLine;
import quests.Q10562_TakeUpArms.Q10562_TakeUpArms;
import quests.Q10566_BestChoice.Q10566_BestChoice;
import quests.Q10575_LetsGoFishing.Q10575_LetsGoFishing;
import quests.Q10576_GlitteringWeapons.Q10576_GlitteringWeapons;
import quests.Q10577_TemperARustingBlade.Q10577_TemperARustingBlade;
import quests.Q10578_TheSoulOfASword.Q10578_TheSoulOfASword;
import quests.Q10579_ContainingTheAttributePower.Q10579_ContainingTheAttributePower;
import quests.Q10658_MakkumInTheDimension.Q10658_MakkumInTheDimension;
import quests.Q10701_TheRoadToDestruction.Q10701_TheRoadToDestruction;
import quests.Q10702_TheRoadToInfinity.Q10702_TheRoadToInfinity;
import quests.Q10703_BottleOfIstinasSoul.Q10703_BottleOfIstinasSoul;
import quests.Q10704_BottleOfOctavisSoul.Q10704_BottleOfOctavisSoul;
import quests.Q10705_BottleOfTautisSoul.Q10705_BottleOfTautisSoul;
import quests.Q10707_FlamesOfSorrow.Q10707_FlamesOfSorrow;
import quests.Q10709_TheStolenSeed.Q10709_TheStolenSeed;
import quests.Q10710_LifeEnergyRepository.Q10710_LifeEnergyRepository;
import quests.Q10732_AForeignLand.Q10732_AForeignLand;
import quests.Q10733_TheTestForSurvival.Q10733_TheTestForSurvival;
import quests.Q10734_DoOrDie.Q10734_DoOrDie;
import quests.Q10735_ASpecialPower.Q10735_ASpecialPower;
import quests.Q10736_ASpecialPower.Q10736_ASpecialPower;
import quests.Q10737_GrakonsWarehouse.Q10737_GrakonsWarehouse;
import quests.Q10738_AnInnerBeauty.Q10738_AnInnerBeauty;
import quests.Q10739_SupplyAndDemand.Q10739_SupplyAndDemand;
import quests.Q10740_NeverForget.Q10740_NeverForget;
import quests.Q10741_ADraughtForTheCold.Q10741_ADraughtForTheCold;
import quests.Q10742_AFurryFriend.Q10742_AFurryFriend;
import quests.Q10743_StrangeFungus.Q10743_StrangeFungus;
import quests.Q10744_StrongerThanSteel.Q10744_StrongerThanSteel;
import quests.Q10745_TheSecretIngredients.Q10745_TheSecretIngredients;
import quests.Q10746_SeeTheWorld.Q10746_SeeTheWorld;
import quests.Q10751_WindsOfFateEncounters.Q10751_WindsOfFateEncounters;
import quests.Q10752_WindsOfFateAPromise.Q10752_WindsOfFateAPromise;
import quests.Q10753_WindsOfFateChoices.Q10753_WindsOfFateChoices;
import quests.Q10755_LettersFromTheQueenWindyHill.Q10755_LettersFromTheQueenWindyHill;
import quests.Q10756_AnInterdimensionalDraft.Q10756_AnInterdimensionalDraft;
import quests.Q10757_QuietingTheStorm.Q10757_QuietingTheStorm;
import quests.Q10758_TheOathOfTheWind.Q10758_TheOathOfTheWind;
import quests.Q10760_LettersFromTheQueenOrcBarracks.Q10760_LettersFromTheQueenOrcBarracks;
import quests.Q10761_AnOrcInLove.Q10761_AnOrcInLove;
import quests.Q10762_MarionetteSpirit.Q10762_MarionetteSpirit;
import quests.Q10763_TerrifyingChertuba.Q10763_TerrifyingChertuba;
import quests.Q10764_FreeSpirit.Q10764_FreeSpirit;
import quests.Q10766_ANewCraft.Q10766_ANewCraft;
import quests.Q10767_AWholeNewLevelOfAlchemy.Q10767_AWholeNewLevelOfAlchemy;
import quests.Q10769_LettersFromTheQueenCrumaTowerPart1.Q10769_LettersFromTheQueenCrumaTowerPart1;
import quests.Q10770_InSearchOfTheGrail.Q10770_InSearchOfTheGrail;
import quests.Q10771_VolatilePower.Q10771_VolatilePower;
import quests.Q10772_ReportsFromCrumaTowerPart1.Q10772_ReportsFromCrumaTowerPart1;
import quests.Q10774_LettersFromTheQueenCrumaTowerPart2.Q10774_LettersFromTheQueenCrumaTowerPart2;
import quests.Q10775_InSearchOfAnAncientGiant.Q10775_InSearchOfAnAncientGiant;
import quests.Q10776_TheWrathOfTheGiants.Q10776_TheWrathOfTheGiants;
import quests.Q10777_ReportsFromCrumaTowerPart2.Q10777_ReportsFromCrumaTowerPart2;
import quests.Q10782_LettersFromTheQueenForsakenPlains.Q10782_LettersFromTheQueenForsakenPlains;
import quests.Q10783_TracesOfAnAmbush.Q10783_TracesOfAnAmbush;
import quests.Q10784_TheBrokenDevice.Q10784_TheBrokenDevice;
import quests.Q10785_LettersFromTheQueenFieldsOfMassacre.Q10785_LettersFromTheQueenFieldsOfMassacre;
import quests.Q10786_ResidentProblemSolver.Q10786_ResidentProblemSolver;
import quests.Q10787_ASpyMission.Q10787_ASpyMission;
import quests.Q10789_LettersFromTheQueenSwampOfScreams.Q10789_LettersFromTheQueenSwampOfScreams;
import quests.Q10790_AMercenaryHelper.Q10790_AMercenaryHelper;
import quests.Q10791_TheManOfMystery.Q10791_TheManOfMystery;
import quests.Q10792_LettersFromTheQueenForestOfTheDead.Q10792_LettersFromTheQueenForestOfTheDead;
import quests.Q10793_SaveTheSouls.Q10793_SaveTheSouls;
import quests.Q10794_InvestigateTheForest.Q10794_InvestigateTheForest;
import quests.Q10795_LettersFromTheQueenWallOfAgros.Q10795_LettersFromTheQueenWallOfAgros;
import quests.Q10796_TheEyeThatDefiedTheGods.Q10796_TheEyeThatDefiedTheGods;
import quests.Q10797_CrossingFate.Q10797_CrossingFate;
import quests.Q10798_LettersFromTheQueenDragonValley.Q10798_LettersFromTheQueenDragonValley;
import quests.Q10799_StrangeThingsAfootInTheValley.Q10799_StrangeThingsAfootInTheValley;
import quests.Q10800_ReconnaissanceAtDragonValley.Q10800_ReconnaissanceAtDragonValley;
import quests.Q10801_TheDimensionalWarpPart1.Q10801_TheDimensionalWarpPart1;
import quests.Q10802_TheDimensionalWarpPart2.Q10802_TheDimensionalWarpPart2;
import quests.Q10803_TheDimensionalWarpPart3.Q10803_TheDimensionalWarpPart3;
import quests.Q10804_TheDimensionalWarpPart4.Q10804_TheDimensionalWarpPart4;
import quests.Q10805_TheDimensionalWarpPart5.Q10805_TheDimensionalWarpPart5;
import quests.Q10806_TheDimensionalWarpPart6.Q10806_TheDimensionalWarpPart6;
import quests.Q10807_TheDimensionalWarpPart7.Q10807_TheDimensionalWarpPart7;
import quests.Q10811_ExaltedOneWhoFacesTheLimit.Q10811_ExaltedOneWhoFacesTheLimit;
import quests.Q10812_FacingSadness.Q10812_FacingSadness;
import quests.Q10813_ForGlory.Q10813_ForGlory;
import quests.Q10814_BefittingOfTheStatus.Q10814_BefittingOfTheStatus;
import quests.Q10815_StepUp.Q10815_StepUp;
import quests.Q10817_ExaltedOneWhoOvercomesTheLimit.Q10817_ExaltedOneWhoOvercomesTheLimit;
import quests.Q10818_ConfrontingAGiantMonster.Q10818_ConfrontingAGiantMonster;
import quests.Q10819_ForHonor.Q10819_ForHonor;
import quests.Q10820_RelationshipsBefittingOfTheStatus.Q10820_RelationshipsBefittingOfTheStatus;
import quests.Q10821_HelpingOthers.Q10821_HelpingOthers;
import quests.Q10823_ExaltedOneWhoShattersTheLimit.Q10823_ExaltedOneWhoShattersTheLimit;
import quests.Q10824_ConfrontingTheGreatestDanger.Q10824_ConfrontingTheGreatestDanger;
import quests.Q10825_ForVictory.Q10825_ForVictory;
import quests.Q10826_LuckBefittingOfTheStatus.Q10826_LuckBefittingOfTheStatus;
import quests.Q10827_StepUpToLead.Q10827_StepUpToLead;
import quests.Q10829_InSearchOfTheCause.Q10829_InSearchOfTheCause;
import quests.Q10830_TheLostGardenOfSpirits.Q10830_TheLostGardenOfSpirits;
import quests.Q10831_UnbelievableSight.Q10831_UnbelievableSight;
import quests.Q10832_EnergyOfSadnessAndAnger.Q10832_EnergyOfSadnessAndAnger;
import quests.Q10833_PutTheQueenOfSpiritsToSleep.Q10833_PutTheQueenOfSpiritsToSleep;
import quests.Q10836_DisappearedClanMember.Q10836_DisappearedClanMember;
import quests.Q10837_LookingForTheBlackbirdClanMember.Q10837_LookingForTheBlackbirdClanMember;
import quests.Q10838_TheReasonForNotBeingAbleToGetOut.Q10838_TheReasonForNotBeingAbleToGetOut;
import quests.Q10839_BlackbirdsNameValue.Q10839_BlackbirdsNameValue;
import quests.Q10840_TimeToRecover.Q10840_TimeToRecover;
import quests.Q10841_DeepInsideAteliaFortress.Q10841_DeepInsideAteliaFortress;
import quests.Q10843_AnomalyInTheEnchantedValley.Q10843_AnomalyInTheEnchantedValley;
import quests.Q10851_ElvenBotany.Q10851_ElvenBotany;
import quests.custom.Q00529_RegularBarrierMaintenance.Q00529_RegularBarrierMaintenance;
import quests.custom.Q00560_HowToOvercomeFear.Q00560_HowToOvercomeFear;
import quests.custom.Q00589_ASecretChange.Q00589_ASecretChange;
import quests.custom.Q00590_ToEachTheirOwn.Q00590_ToEachTheirOwn;
import quests.custom.Q00683_AdventOfKrofinSubspecies.Q00683_AdventOfKrofinSubspecies;
import quests.custom.Q00684_DisturbedFields.Q00684_DisturbedFields;
import quests.custom.Q10516_UnveiledFafurionTemple.Q10516_UnveiledFafurionTemple;
import quests.custom.Q10517_FafurionsMinions.Q10517_FafurionsMinions;
import quests.custom.Q10518_SucceedingThePriestess.Q10518_SucceedingThePriestess;
import quests.custom.Q10519_ControllingYourTemper.Q10519_ControllingYourTemper;
import quests.custom.Q10520_TempleGuardians.Q10520_TempleGuardians;
import quests.custom.Q10529_IvoryTowersResearchFloatingSeaJournal.Q10529_IvoryTowersResearchFloatingSeaJournal;
import quests.custom.Q10533_OrfensAmbition.Q10533_OrfensAmbition;
import quests.not_done.*;

/**
 * @author NosBit
 */
public class QuestMasterHandler
{
	private static final Logger LOGGER = Logger.getLogger(QuestMasterHandler.class.getName());
	
	private static final Class<?>[] QUESTS =
	{
		Q00013_ParcelDelivery.class,
		Q00015_SweetWhispers.class,
		Q00016_TheComingDarkness.class,
		Q00017_LightAndDarkness.class,
		Q00031_SecretBuriedInTheSwamp.class,
		Q00032_AnObviousLie.class,
		Q00033_MakeAPairOfDressShoes.class,
		Q00035_FindGlitteringJewelry.class,
		Q00036_MakeASewingKit.class,
		Q00037_MakeFormalWear.class,
		Q00040_ASpecialOrder.class,
		Q00042_HelpTheUncle.class,
		Q00043_HelpTheSister.class,
		Q00044_HelpTheSon.class,
		Q00061_LawEnforcement.class,
		Q00115_TheOtherSideOfTruth.class,
		Q00119_LastImperialPrince.class,
		Q00128_PailakaSongOfIceAndFire.class,
		Q00129_PailakaDevilsLegacy.class,
		Q00134_TempleMissionary.class,
		Q00135_TempleExecutor.class,
		Q00136_MoreThanMeetsTheEye.class,
		Q00137_TempleChampionPart1.class,
		Q00138_TempleChampionPart2.class,
		Q00139_ShadowFoxPart1.class,
		Q00140_ShadowFoxPart2.class,
		Q00141_ShadowFoxPart3.class,
		Q00142_FallenAngelRequestOfDawn.class,
		Q00143_FallenAngelRequestOfDusk.class,
		Q00144_PailakaInjuredDragon.class,
		Q00149_PrimalMotherIstina.class,
		Q00150_ExtremeChallengePrimalMotherResurrected.class,
		Q00177_SplitDestiny.class,
		Q00180_InfernalFlamesBurningInCrystalPrison.class,
		Q00181_DevilsStrikeBackAdventOfBalok.class,
		Q00183_RelicExploration.class,
		Q00184_ArtOfPersuasion.class,
		Q00185_NikolasCooperation.class,
		Q00186_ContractExecution.class,
		Q00187_NikolasHeart.class,
		Q00188_SealRemoval.class,
		Q00189_ContractCompletion.class,
		Q00190_LostDream.class,
		Q00191_VainConclusion.class,
		Q00192_SevenSignsSeriesOfDoubt.class,
		Q00193_SevenSignsDyingMessage.class,
		Q00194_SevenSignsMammonsContract.class,
		Q00195_SevenSignsSecretRitualOfThePriests.class,
		Q00196_SevenSignsSealOfTheEmperor.class,
		Q00197_SevenSignsTheSacredBookOfSeal.class,
		Q00198_SevenSignsEmbryo.class,
		Q00210_ObtainAWolfPet.class,
		Q00254_LegendaryTales.class,
		Q00337_AudienceWithTheLandDragon.class,
		Q00344_1000YearsTheEndOfLamentation.class,
		Q00371_ShrieksOfGhosts.class,
		Q00386_StolenDignity.class,
		Q00420_LittleWing.class,
		Q00421_LittleWingsBigAdventure.class,
		Q00450_GraveRobberRescue.class,
		Q00451_LuciensAltar.class,
		Q00452_FindingtheLostSoldiers.class,
		Q00453_NotStrongEnoughAlone.class,
		Q00454_CompletelyLost.class,
		Q00455_WingsOfSand.class,
		Q00456_DontKnowDontCare.class,
		Q00459_TheVillainOfTheUndergroundMineTeredor.class,
		Q00460_PreciousResearchMaterial.class,
		Q00462_StuffedAncientHeroes.class,
		Q00465_WeAreFriends.class,
		Q00466_PlacingMySmallPower.class,
		Q00468_BeLostInTheMysteriousScent.class,
		Q00469_SuspiciousGardener.class,
		Q00470_DivinityProtector.class,
		Q00471_BreakingThroughTheEmeraldSquare.class,
		Q00472_ChallengeSteamCorridor.class,
		Q00473_InTheCoralGarden.class,
		Q00474_WaitingForTheSummer.class,
		Q00476_PlainMission.class,
		Q00482_RecertificationOfValue.class,
		Q00483_IntendedTactic.class,
		Q00485_HotSpringWater.class,
		Q00492_TombRaiders.class,
		Q00493_KickingOutUnwelcomeGuests.class,
		Q00494_IncarnationOfGreedZellakaGroup.class,
		Q00495_IncarnationOfJealousyPellineGroup.class,
		Q00496_IncarnationOfGluttonyKaliosGroup.class,
		Q00497_IncarnationOfGreedZellakaSolo.class,
		Q00498_IncarnationOfJealousyPellineSolo.class,
		Q00499_IncarnationOfGluttonyKaliosSolo.class,
		Q00500_BrothersBoundInChains.class,
		Q00504_CompetitionForTheBanditStronghold.class, // TODO: Not done.
		Q00511_AwlUnderFoot.class,
		Q00512_BladeUnderFoot.class,
		Q00529_RegularBarrierMaintenance.class, // FIXME: Custom.
		Q00551_OlympiadStarter.class,
		Q00553_OlympiadUndefeated.class,
		Q00560_HowToOvercomeFear.class, // FIXME: Custom.
		Q00561_BasicMissionHarnakUndergroundRuins.class,
		Q00562_BasicMissionAltarOfEvil.class,
		Q00563_BasicMissionBloodySwampland.class,
		Q00564_BasicMissionKartiasLabyrinthSolo.class,
		Q00565_BasicMissionFairySettlementWest.class, // TODO: Not done.
		Q00566_BasicMissionFairySettlementEast.class, // TODO: Not done.
		Q00567_BasicMissionIsleOfSouls.class, // TODO: Not done.
		Q00568_SpecialMissionNornilsCave.class, // TODO: Not done.
		Q00569_BasicMissionSealOfShilen.class, // TODO: Not done.
		Q00570_SpecialMissionKartiasLabyrinthParty.class, // TODO: Not done.
		Q00571_SpecialMissionProofOfUnityFieldRaid.class, // TODO: Not done.
		Q00572_SpecialMissionProofOfCourageFieldRaid.class, // TODO: Not done.
		Q00573_SpecialMissionProofOfStrengthFieldRaid.class, // TODO: Not done.
		Q00574_SpecialMissionNornilsGarden.class, // TODO: Not done.
		Q00576_SpecialMissionDefeatSpezion.class, // TODO: Not done.
		Q00577_BasicMissionSilentValley.class, // TODO: Not done.
		Q00578_BasicMissionCemetery.class, // TODO: Not done.
		Q00579_BasicMissionBlazingSwamp.class, // TODO: Not done.
		Q00580_BeyondTheMemories.class,
		Q00581_ThePurificationRitual.class,
		Q00582_WashBloodWithBlood.class,
		Q00583_MeaningOfSurvival.class,
		Q00584_NeverSayGoodBye.class,
		Q00585_CantGoAgainstTheTime.class, // TODO: Not done.
		Q00586_MutatedCreatures.class, // TODO: Not done.
		Q00587_MoreAggressiveOperation.class, // TODO: Not done.
		Q00588_HeadOnCrash.class, // TODO: Not done.
		Q00589_ASecretChange.class, // FIXME: Custom.
		Q00590_ToEachTheirOwn.class, // FIXME: Custom.
		Q00591_GreatAmbitions.class, // TODO: Not done.
		Q00593_BasicMissionPaganTemple.class, // TODO: Not done.
		Q00594_BasicMissionDimensionalRift.class, // TODO: Not done.
		Q00595_SpecialMissionRaidersCrossroads.class, // TODO: Not done.
		Q00596_SpecialMissionDefeatBaylor.class, // TODO: Not done.
		Q00599_DemonsAndDimensionalEnergy.class, // TODO: Not done.
		Q00600_KeyToTheRefiningProcess.class, // TODO: Not done.
		Q00617_GatherTheFlames.class,
		Q00618_IntoTheFlame.class,
		Q00620_FourGoblets.class,
		Q00621_EggDelivery.class,
		Q00622_SpecialtyLiquorDelivery.class,
		Q00623_TheFinestFood.class,
		Q00627_HeartInSearchOfPower.class,
		Q00648_AnIceMerchantsDream.class,
		Q00655_AGrandPlanForTamingWildBeasts.class, // TODO: Not done.
		Q00662_AGameOfCards.class,
		Q00663_SeductiveWhispers.class,
		Q00665_BasicTrainingForHunterGuildMember.class, // TODO: Not done.
		Q00666_HunterGuildMembersKnowledge.class, // TODO: Not done.
		Q00667_CoveringShilensEyes.class, // TODO: Not done.
		Q00668_ABattleWithTheGiants.class, // TODO: Not done.
		Q00669_DesperateFightWithTheDragons.class, // TODO: Not done.
		Q00670_DefeatingTheLordOfSeed.class,
		Q00671_PathToFindingThePast.class, // TODO: Not done.
		Q00672_ArchenemyEmbryo.class, // TODO: Not done.
		Q00673_BelethAmbition.class, // TODO: Not done.
		Q00674_ChangesInTheShadowOfTheMotherTree.class, // TODO: Not done.
		Q00675_WhatTheThreadOfThePastShows.class, // TODO: Not done.
		Q00682_TheStrongInTheClosedSpace.class, // TODO: Not done.
		Q00683_AdventOfKrofinSubspecies.class, // FIXME: Custom.
		Q00684_DisturbedFields.class, // FIXME: Custom.
		Q00726_LightWithinTheDarkness.class,
		Q00727_HopeWithinTheDarkness.class,
		Q00737_ASwordHiddenInASmile.class, // TODO: Not done.
		Q00738_DimensionalExplorationOfTheUnworldlyVisitors.class, // TODO: Not done.
		Q00743_AtTheAltarOfOblivion.class, // TODO: Not done.
		Q00744_TheAlligatorHunterReturns.class, // TODO: Not done.
		Q00745_TheOutlawsAreIncoming.class, // TODO: Not done.
		Q00747_DefendingTheForsakenPlains.class, // TODO: Not done.
		Q00748_EndlessRevenge.class, // TODO: Not done.
		Q00749_TiesWithTheGuardians.class, // TODO: Not done.
		Q00750_SevenFlowers.class, // TODO: Not done.
		Q00751_LiberatingTheSpirits.class,
		Q00752_UncoverTheSecret.class,
		Q00753_ReactingToACrisis.class,
		Q00754_AssistingTheRebelForces.class,
		Q00755_InNeedOfPetras.class,
		Q00756_TopQualityPetra.class,
		Q00757_TriolsMovement.class,
		Q00758_TheFallenKingsMen.class,
		Q00759_TheDwarvenNightmareContinues.class, // TODO: Not done.
		Q00760_BlockTheExit.class,
		Q00761_AssistingTheGoldenRamArmy.class,
		Q00762_AnOminousRequest.class,
		Q00763_ADauntingTask.class,
		Q00764_WeakeningTheVarkaSilenosForces.class,
		Q00765_WeakeningTheKetraOrcForces.class,
		Q00773_ToCalmTheFlood.class, // TODO: Not done.
		Q00774_DreamingOfPeace.class, // TODO: Not done.
		Q00775_RetrievingTheChaosFragment.class,
		Q00776_SlayDarkLordEkimus.class,
		Q00777_SlayDarkLordTiat.class,
		Q00778_OperationRoaringFlame.class,
		Q00779_UtilizeTheDarknessSeedOfDestruction.class,
		Q00780_UtilizeTheDarknessSeedOfInfinity.class, // TODO: Not done.
		Q00781_UtilizeTheDarknessSeedOfAnnihilation.class, // TODO: Not done.
		Q00782_UtilizeTheDarknessSeedOfHellfire.class, // TODO: Not done.
		Q00783_VestigeOfTheMagicPower.class,
		Q00787_TheRoleOfAWatcher.class,
		Q00789_WaitingForPaagrio.class, // TODO: Not done.
		Q00790_ObtainingFerinsTrust.class,
		Q00792_TheSuperionGiants.class, // TODO: Not done.
		Q00816_PlansToRepairTheStronghold.class, // TODO: Not done.
		Q00817_BlackAteliaResearch.class,
		Q00823_DisappearedRaceNewFairy.class,
		Q00824_AttackTheCommandPost.class, // TODO: Not done.
		Q00826_InSearchOfTheSecretWeapon.class,
		Q00827_EinhasadsOrder.class,
		Q00828_EvasBlessing.class,
		Q00829_MaphrsSalvation.class,
		Q00830_TheWayOfTheGiantsPawn.class,
		Q00831_SayhasScheme.class,
		Q00835_PitiableMelisa.class,
		Q00836_RequestFromTheBlackbirdClan.class, // TODO: Not done.
		Q00837_RequestFromTheGiantTrackers.class, // TODO: Not done.
		Q00838_RequestFromTheMotherTreeGuardians.class, // TODO: Not done.
		Q00839_RequestFromTheUnworldlyVisitors.class, // TODO: Not done.
		Q00840_RequestFromTheKingdomsRoyalGuard.class, // TODO: Not done.
		Q00841_ContaminationContainment.class, // TODO: Not done.
		Q00842_CaptiveDemons.class, // TODO: Not done.
		Q00843_GiantEvolutionControl.class, // TODO: Not done.
		Q00844_GiantsTreasure.class, // TODO: Not done.
		Q00845_SabotageTheEmbryoSupplies.class, // TODO: Not done.
		Q00846_BuildingUpStrength.class, // TODO: Not done.
		Q00901_HowLavasaurusesAreMade.class,
		Q00902_ReclaimOurEra.class,
		Q00903_TheCallOfAntharas.class,
		Q00905_RefinedDragonBlood.class,
		Q00906_TheCallOfValakas.class,
		Q00923_ShinedustExtraction.class, // TODO: Not done.
		Q00924_GiantOfTheRestorationRoom.class, // TODO: Not done.
		Q00926_30DaySearchOperation.class,
		Q00928_100DaySubjugationOperation.class,
		Q00929_SeekerRescue.class, // TODO: Not done.
		Q00930_DisparagingThePhantoms.class, // TODO: Not done.
		Q00931_MemoriesOfTheWind.class, // TODO: Not done.
		Q00932_SayhasEnergy.class, // TODO: Not done.
		Q00937_ToReviveTheFishingGuild.class,
		Q00985_AdventureGuildsSpecialRequestLv1.class, // TODO: Not done.
		Q00986_AdventureGuildsSpecialRequestLv2.class, // TODO: Not done.
		Q00987_AdventureGuildsSpecialRequestLv3.class, // TODO: Not done.
		Q00988_AdventureGuildsSpecialRequestLv4.class, // TODO: Not done.
		Q00989_AdventureGuildsSpecialRequestLv5.class, // TODO: Not done.
		Q10282_ToTheSeedOfAnnihilation.class,
		Q10283_RequestOfIceMerchant.class,
		Q10284_AcquisitionOfDivineSword.class,
		Q10285_MeetingSirra.class,
		Q10286_ReunionWithSirra.class,
		Q10287_StoryOfThoseLeft.class,
		Q10290_LandDragonConqueror.class,
		Q10291_FireDragonDestroyer.class,
		Q10292_SevenSignsGirlOfDoubt.class,
		Q10293_SevenSignsForbiddenBookOfTheElmoreAdenKingdom.class,
		Q10294_SevenSignsToTheMonasteryOfSilence.class,
		Q10295_SevenSignsSolinasTomb.class,
		Q10296_SevenSignsOneWhoSeeksThePowerOfTheSeal.class,
		Q10297_GrandOpeningComeToOurPub.class,
		Q10298_WastelandQueen.class, // TODO: Not done.
		Q10301_ShadowOfTerrorBlackishRedFog.class,
		Q10302_UnsettlingShadowAndRumors.class,
		Q10303_CrossroadsBetweenLightAndDarkness.class,
		Q10305_UnstoppableFutileEfforts.class,
		Q10306_TheCorruptedLeader.class,
		Q10307_TheCorruptedLeaderHisTruth.class,
		Q10310_TwistedCreationTree.class,
		Q10311_PeacefulDaysAreOver.class,
		Q10312_AbandonedGodsCreature.class,
		Q10315_ToThePrisonOfDarkness.class,
		Q10316_UndecayingMemoryOfThePast.class,
		Q10317_OrbisWitch.class,
		Q10318_DecayingDarkness.class,
		Q10320_LetsGoToTheCentralSquare.class,
		Q10321_QualificationsOfTheSeeker.class,
		Q10330_ToTheRuinsOfYeSagira.class,
		Q10331_StartOfFate.class,
		Q10332_ToughRoad.class,
		Q10333_DisappearedSakum.class,
		Q10334_ReportingTheStatusOfTheWindmillHill.class,
		Q10335_RequestToFindSakum.class,
		Q10336_DividedSakumKanilov.class,
		Q10337_SakumsImpact.class,
		Q10338_SeizeYourDestiny.class,
		Q10341_DayOfDestinyHumansFate.class,
		Q10342_DayOfDestinyElvenFate.class,
		Q10343_DayOfDestinyDarkElfsFate.class,
		Q10344_DayOfDestinyOrcsFate.class,
		Q10345_DayOfDestinyDwarfsFate.class,
		Q10346_DayOfDestinyKamaelsFate.class,
		Q10351_OwnerOfHall.class,
		Q10353_CertificationOfValue.class,
		Q10354_ResurrectedOwnerOfHall.class,
		Q10355_BlacksmithsSoul1.class, // TODO: Not done.
		Q10356_BlacksmithsSoul2.class, // TODO: Not done.
		Q10358_DividedSakumPoslof.class,
		Q10359_TracesOfEvil.class,
		Q10360_CertificationOfFate.class,
		Q10362_CertificationOfTheSeeker.class,
		Q10363_RequestOfTheSeeker.class,
		Q10364_ObligationsOfTheSeeker.class,
		Q10365_ForTheSearchdogKing.class,
		Q10366_ReportOnTheSituationAtTheRuins.class,
		Q10369_NoblesseSoulTesting.class,
		Q10373_ExploringTheDimensionSealingTheDimension.class, // TODO: Not done.
		Q10377_TheInvadedExecutionGrounds.class,
		Q10378_WeedingWork.class,
		Q10379_AnUninvitedGuest.class,
		Q10380_TheExecutionersExecution.class,
		Q10381_ToTheSeedOfHellfire.class,
		Q10382_DayOfLiberation.class,
		Q10383_FergasonsOffer.class,
		Q10384_AnAudienceWithTauti.class,
		Q10385_RedThreadOfFate.class,
		Q10386_MysteriousJourney.class,
		Q10387_SoullessOne.class,
		Q10388_ConspiracyBehindDoor.class,
		Q10389_TheVoiceOfAuthority.class,
		Q10390_KekropusLetter.class,
		Q10391_ASuspiciousHelper.class,
		Q10392_FailureAndItsConsequences.class,
		Q10393_KekropusLetterAClueCompleted.class,
		Q10394_MutualBenefit.class,
		Q10395_NotATraitor.class,
		Q10401_KekropusLetterDecodingTheBadge.class,
		Q10402_NowhereToTurn.class,
		Q10403_TheGuardianGiant.class,
		Q10404_KekropusLetterAHiddenMeaning.class,
		Q10405_KartiasSeed.class,
		Q10406_BeforeDarknessBearsFruit.class,
		Q10408_KekropusLetterTheSwampOfScreams.class,
		Q10409_ASuspiciousVagabondInTheSwamp.class,
		Q10410_EmbryoInTheSwampOfScreams.class,
		Q10411_KekropusLetterTheForestOfTheDead.class,
		Q10412_ASuspiciousVagabondInTheForest.class,
		Q10413_EmbryoInTheForestOfTheDead.class,
		Q10414_KekropusLetterWithCourage.class,
		Q10415_KekropusLetterWithWisdom.class,
		Q10416_InSearchOfTheEyeOfArgos.class,
		Q10417_DaimonTheWhiteEyed.class,
		Q10418_TheImmortalPirateKing.class, // TODO: Not done.
		Q10419_KekropusLetterKampfsWhereabouts.class,
		Q10420_TheVarkaSilenosSupporters.class,
		Q10421_AssassinationOfTheVarkaSilenosCommander.class,
		Q10422_AssassinationOfTheVarkaSilenosChief.class,
		Q10423_EmbryoStrongholdRaid.class, // TODO: Not done.
		Q10424_KekropusLetterBelosWhereabouts.class,
		Q10425_TheKetraOrcSupporters.class,
		Q10426_AssassinationOfTheKetraOrcCommander.class,
		Q10427_AssassinationOfTheKetraOrcChief.class,
		Q10445_AnImpendingThreat.class,
		Q10446_HitAndRun.class,
		Q10447_TimingIsEverything.class,
		Q10450_ADarkAmbition.class,
		Q10453_StoppingTheWindDragon.class,
		Q10454_FinalEmbryoApostle.class, // TODO: Not done.
		Q10455_ElikiasLetter.class,
		Q10456_OperationRescue.class,
		Q10457_KefensisIllusion.class, // TODO: Not done.
		Q10459_ASickAmbition.class,
		Q10460_ReturnOfTheAlligatorHunter.class,
		Q10472_WindsOfFateEncroachingShadows.class,
		Q10501_ZakenEmbroideredSoulCloak.class,
		Q10502_FreyaEmbroideredSoulCloak.class,
		Q10503_FrintezzaEmbroideredSoulCloak.class,
		Q10504_JewelOfAntharas.class,
		Q10505_JewelOfValakas.class,
		Q10516_UnveiledFafurionTemple.class, // FIXME: Custom.
		Q10517_FafurionsMinions.class, // FIXME: Custom.
		Q10518_SucceedingThePriestess.class, // FIXME: Custom.
		Q10519_ControllingYourTemper.class, // FIXME: Custom.
		Q10520_TempleGuardians.class, // FIXME: Custom.
		Q10521_QueenNavarisLetterVarkaSilenosBarracks.class,
		Q10522_TheDarkSecretOfVarkaSilenos.class,
		Q10523_TheAssassinationOfTheVarkaSilenosCommander.class,
		Q10524_TheAssassinationOfTheVarkaSilenosCommanderChief.class,
		Q10525_QueenNavarisLetterKetraOrcOutpost.class,
		Q10526_TheDarkSecretOfTheKetraOrcs.class,
		Q10527_TheAssassinationOfTheKetraOrcCommander.class,
		Q10528_TheAssassinationOfTheKetraOrcChief.class,
		Q10529_IvoryTowersResearchFloatingSeaJournal.class, // FIXME: Custom.
		Q10530_KekropusLetterTheDragonsTransition.class,
		Q10531_OddHappeningsAtDragonValley.class, // TODO: Not done.
		Q10532_UncoveringTheConspiracy.class, // TODO: Not done.
		Q10533_OrfensAmbition.class, // FIXME: Custom.
		Q10534_HatchlingResearch.class,
		Q10535_BlacksmithsSoul3.class, // TODO: Not done.
		Q10537_KamaelDisarray.class, // TODO: Not done.
		Q10538_GiantsEvolution.class, // TODO: Not done.
		Q10539_EnergySupplyCutoffPlan.class, // TODO: Not done.
		Q10540_ThwartingMimirsPlan.class, // TODO: Not done.
		Q10541_TrainLikeTheRealThing.class,
		Q10542_SearchingForNewPower.class,
		Q10543_SheddingWeight.class,
		Q10544_SeekerSupplies.class,
		Q10552_ChallengeBalthusKnight.class, // TODO: Not done.
		Q10553_WhatMattersMoreThanAbility.class, // TODO: Not done.
		Q10554_GiftForYou.class, // TODO: Not done.
		Q10555_ChargeAtAntharas.class, // TODO: Not done.
		Q10556_ForgottenPowerStartOfFate.class, // TODO: Not done.
		Q10557_NewPowerWindsOfFate.class, // TODO: Not done.
		Q10558_HiddenInChaos.class, // TODO: Not done.
		Q10559_BeforeTheGuide.class, // TODO: Not done.
		Q10560_WayOfWanderingKnight.class,
		Q10561_AcrossTheDeathLine.class,
		Q10562_TakeUpArms.class,
		Q10563_ControlOfPower.class, // TODO: Not done.
		Q10564_ProveProgress.class, // TODO: Not done.
		Q10565_NothingIsImpossible.class, // TODO: Not done.
		Q10566_BestChoice.class,
		Q10567_SpecialMissionNornilsGarden.class, // TODO: Not done.
		Q10568_KamaelsTechnologicalAdvancement.class, // TODO: Not done.
		Q10569_DeclarationOfWar.class, // TODO: Not done.
		Q10570_HurrahForKamaelsIndependence.class, // TODO: Not done.
		Q10571_StrategicReconciliation.class, // TODO: Not done.
		Q10572_ToExpelTheEmbryosForces.class, // TODO: Not done.
		Q10575_LetsGoFishing.class,
		Q10576_GlitteringWeapons.class,
		Q10577_TemperARustingBlade.class,
		Q10578_TheSoulOfASword.class,
		Q10579_ContainingTheAttributePower.class,
		Q10580_SpecialMissionDefeatSpezion.class, // TODO: Not done.
		Q10588_SpecialMissionDefeatBaylor.class, // TODO: Not done.
		Q10594_FergasonsScheme.class, // TODO: Not done.
		Q10595_TheDimensionalWarpPart8.class, // TODO: Not done.
		Q10596_TheDimensionalWarpPart9.class, // TODO: Not done.
		Q10597_EscapeToTheShadowOfTheMotherTree.class, // TODO: Not done.
		Q10598_WithAllYourMight.class, // TODO: Not done.
		Q10599_ThreadOfFateHangingOnTheMotherTree.class, // TODO: Not done.
		Q10658_MakkumInTheDimension.class,
		Q10701_TheRoadToDestruction.class,
		Q10702_TheRoadToInfinity.class,
		Q10703_BottleOfIstinasSoul.class,
		Q10704_BottleOfOctavisSoul.class,
		Q10705_BottleOfTautisSoul.class,
		Q10707_FlamesOfSorrow.class,
		Q10709_TheStolenSeed.class,
		Q10710_LifeEnergyRepository.class,
		Q10732_AForeignLand.class,
		Q10733_TheTestForSurvival.class,
		Q10734_DoOrDie.class,
		Q10735_ASpecialPower.class,
		Q10736_ASpecialPower.class,
		Q10737_GrakonsWarehouse.class,
		Q10738_AnInnerBeauty.class,
		Q10739_SupplyAndDemand.class,
		Q10740_NeverForget.class,
		Q10741_ADraughtForTheCold.class,
		Q10742_AFurryFriend.class,
		Q10743_StrangeFungus.class,
		Q10744_StrongerThanSteel.class,
		Q10745_TheSecretIngredients.class,
		Q10746_SeeTheWorld.class,
		Q10748_MysteriousSuggestion1.class, // TODO: Not done.
		Q10749_MysteriousSuggestion2.class, // TODO: Not done.
		Q10751_WindsOfFateEncounters.class,
		Q10752_WindsOfFateAPromise.class,
		Q10753_WindsOfFateChoices.class,
		Q10755_LettersFromTheQueenWindyHill.class,
		Q10756_AnInterdimensionalDraft.class,
		Q10757_QuietingTheStorm.class,
		Q10758_TheOathOfTheWind.class,
		Q10760_LettersFromTheQueenOrcBarracks.class,
		Q10761_AnOrcInLove.class,
		Q10762_MarionetteSpirit.class,
		Q10763_TerrifyingChertuba.class,
		Q10764_FreeSpirit.class,
		Q10766_ANewCraft.class,
		Q10767_AWholeNewLevelOfAlchemy.class,
		Q10769_LettersFromTheQueenCrumaTowerPart1.class,
		Q10770_InSearchOfTheGrail.class,
		Q10771_VolatilePower.class,
		Q10772_ReportsFromCrumaTowerPart1.class,
		Q10774_LettersFromTheQueenCrumaTowerPart2.class,
		Q10775_InSearchOfAnAncientGiant.class,
		Q10776_TheWrathOfTheGiants.class,
		Q10777_ReportsFromCrumaTowerPart2.class,
		Q10782_LettersFromTheQueenForsakenPlains.class,
		Q10783_TracesOfAnAmbush.class,
		Q10784_TheBrokenDevice.class,
		Q10785_LettersFromTheQueenFieldsOfMassacre.class,
		Q10786_ResidentProblemSolver.class,
		Q10787_ASpyMission.class,
		Q10789_LettersFromTheQueenSwampOfScreams.class,
		Q10790_AMercenaryHelper.class,
		Q10791_TheManOfMystery.class,
		Q10792_LettersFromTheQueenForestOfTheDead.class,
		Q10793_SaveTheSouls.class,
		Q10794_InvestigateTheForest.class,
		Q10795_LettersFromTheQueenWallOfAgros.class,
		Q10796_TheEyeThatDefiedTheGods.class,
		Q10797_CrossingFate.class,
		Q10798_LettersFromTheQueenDragonValley.class,
		Q10799_StrangeThingsAfootInTheValley.class,
		Q10800_ReconnaissanceAtDragonValley.class,
		Q10801_TheDimensionalWarpPart1.class,
		Q10802_TheDimensionalWarpPart2.class,
		Q10803_TheDimensionalWarpPart3.class,
		Q10804_TheDimensionalWarpPart4.class,
		Q10805_TheDimensionalWarpPart5.class,
		Q10806_TheDimensionalWarpPart6.class,
		Q10807_TheDimensionalWarpPart7.class,
		Q10811_ExaltedOneWhoFacesTheLimit.class,
		Q10812_FacingSadness.class,
		Q10813_ForGlory.class,
		Q10814_BefittingOfTheStatus.class,
		Q10815_StepUp.class,
		Q10817_ExaltedOneWhoOvercomesTheLimit.class,
		Q10818_ConfrontingAGiantMonster.class,
		Q10819_ForHonor.class,
		Q10820_RelationshipsBefittingOfTheStatus.class,
		Q10821_HelpingOthers.class,
		Q10823_ExaltedOneWhoShattersTheLimit.class,
		Q10824_ConfrontingTheGreatestDanger.class,
		Q10825_ForVictory.class,
		Q10826_LuckBefittingOfTheStatus.class,
		Q10827_StepUpToLead.class,
		Q10829_InSearchOfTheCause.class,
		Q10830_TheLostGardenOfSpirits.class,
		Q10831_UnbelievableSight.class,
		Q10832_EnergyOfSadnessAndAnger.class,
		Q10833_PutTheQueenOfSpiritsToSleep.class,
		Q10836_DisappearedClanMember.class,
		Q10837_LookingForTheBlackbirdClanMember.class,
		Q10838_TheReasonForNotBeingAbleToGetOut.class,
		Q10839_BlackbirdsNameValue.class,
		Q10840_TimeToRecover.class,
		Q10841_DeepInsideAteliaFortress.class,
		Q10843_AnomalyInTheEnchantedValley.class,
		Q10844_BloodyBattleSeizingSupplies.class, // TODO: Not done.
		Q10845_BloodyBattleRescueTheSmiths.class, // TODO: Not done.
		Q10846_BloodyBattleMeetingTheCommander.class, // TODO: Not done.
		Q10848_TrialsBeforeTheBattle.class, // TODO: Not done.
		Q10849_TrialsForAdaptation.class, // TODO: Not done.
		Q10851_ElvenBotany.class,
		Q10852_TheMotherTreeRevivalProject.class, // TODO: Not done.
		Q10853_ToWeakenTheGiants.class, // TODO: Not done.
		Q10854_ToSeizeTheFortress.class, // TODO: Not done.
		Q10856_SuperionAppears.class, // TODO: Not done.
		Q10857_SecretTeleport.class, // TODO: Not done.
		Q10858_QueenRamonaControllerOfTheVessel.class, // TODO: Not done.
		Q10859_OwnTheEarthAndTheHeavens.class, // TODO: Not done.
		Q10873_ExaltedReachingAnotherLevel.class, // TODO: Not done.
		Q10874_AgainstTheNewEnemy.class, // TODO: Not done.
		Q10875_ForReputation.class, // TODO: Not done.
		Q10876_LeadersGrace.class, // TODO: Not done.
		Q10877_BreakThroughCrisis.class, // TODO: Not done.
		Q10879_ExaltedGuideToPower.class, // TODO: Not done.
		Q10880_TheLastOneStanding.class, // TODO: Not done.
		Q10881_ForThePride.class, // TODO: Not done.
		Q10882_VictoryCollection.class, // TODO: Not done.
		Q10883_ImmortalHonor.class, // TODO: Not done.
		Q10886_SaviorsPathSearchTheRefinery.class, // TODO: Not done.
		Q10887_SaviorsPathDemonsAndAtelia.class, // TODO: Not done.
		Q10888_SaviorsPathDefeatTheEmbryo.class, // TODO: Not done.
		Q10889_SaviorsPathFallenEmperorsThrone.class, // TODO: Not done.
		Q10890_SaviorsPathFallOfEtina.class, // TODO: Not done.
		Q10891_AtANewPlace.class, // TODO: Not done.
		Q10892_RevengeOneStepAtATime.class, // TODO: Not done.
		Q10893_EndOfTwistedFate.class, // TODO: Not done.
		Q10895_RestrainQueenKrosha.class, // TODO: Not done.
		Q10896_VisitTheAdventureGuild.class, // TODO: Not done.
		Q10897_ShowYourAbility.class, // TODO: Not done.
		Q10898_TowardAGoal.class, // TODO: Not done.
		Q10899_VeteranAdventurer.class, // TODO: Not done.
		Q10900_PathToStrength.class, // TODO: Not done.
		Q10901_AModelAdventurer.class, // TODO: Not done.
	};
	
	public static void main(String[] args)
	{
		for (Class<?> quest : QUESTS)
		{
			try
			{
				quest.getDeclaredConstructor().newInstance();
			}
			catch (Exception e)
			{
				LOGGER.log(Level.SEVERE, QuestMasterHandler.class.getSimpleName() + ": Failed loading " + quest.getSimpleName() + ":", e);
			}
		}
	}
}
