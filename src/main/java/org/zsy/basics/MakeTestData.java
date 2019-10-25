package org.zsy.basics;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import org.apache.ibatis.session.SqlSession;
import org.zsy.repository.mapper.AppInfoCompetitorMapper;
import org.zsy.repository.mapper.AppInfoMapper;
import org.zsy.repository.mapper.AppStatisticsDayMapper;
import org.zsy.repository.mapper.AppStatisticsMonthMapper;
import org.zsy.repository.mapper.AppUserDrawAnnualPayMapper;
import org.zsy.repository.mapper.AppUserDrawAppPreferencesMapper;
import org.zsy.repository.mapper.AppUserDrawBrandRateMapper;
import org.zsy.repository.mapper.AppUserDrawBusinessMapper;
import org.zsy.repository.mapper.AppUserDrawCityLevelMapper;
import org.zsy.repository.mapper.AppUserDrawConsumeMapper;
import org.zsy.repository.mapper.AppUserDrawCreditRateMapper;
import org.zsy.repository.mapper.AppUserDrawEduMapper;
import org.zsy.repository.mapper.AppUserDrawFamilyMapper;
import org.zsy.repository.mapper.AppUserDrawInterestMapper;
import org.zsy.repository.mapper.AppUserDrawMapper;
import org.zsy.repository.mapper.AppUserDrawMediaSourceMapper;
import org.zsy.repository.mapper.AppUserDrawMediaTimeMapper;
import org.zsy.repository.mapper.AppUserDrawPlatformMapper;
import org.zsy.repository.mapper.AppUserDrawRegionMapper;
import org.zsy.repository.mapper.AppUserDrawRegionRateMapper;
import org.zsy.repository.mapper.AppUserDrawSystemMapper;
import org.zsy.repository.mapper.AppUserDrawTypeMapper;
import org.zsy.repository.mapper.AppUserDrawWorthMapper;
import org.zsy.repository.mapper.DmpCodeRegionMapper;
import org.zsy.repository.mapper.DmpTagDimensionMapper;
import org.zsy.repository.model.AppInfo;
import org.zsy.repository.model.AppInfoCompetitor;
import org.zsy.repository.model.AppInfoExample;
import org.zsy.repository.model.AppStatisticsDay;
import org.zsy.repository.model.AppStatisticsDayExample;
import org.zsy.repository.model.AppStatisticsMonth;
import org.zsy.repository.model.AppStatisticsMonthExample;
import org.zsy.repository.model.AppUserDraw;
import org.zsy.repository.model.AppUserDrawAnnualPay;
import org.zsy.repository.model.AppUserDrawAnnualPayExample;
import org.zsy.repository.model.AppUserDrawAppPreferences;
import org.zsy.repository.model.AppUserDrawAppPreferencesExample;
import org.zsy.repository.model.AppUserDrawBrandRate;
import org.zsy.repository.model.AppUserDrawBrandRateExample;
import org.zsy.repository.model.AppUserDrawBusiness;
import org.zsy.repository.model.AppUserDrawBusinessExample;
import org.zsy.repository.model.AppUserDrawCityLevel;
import org.zsy.repository.model.AppUserDrawCityLevelExample;
import org.zsy.repository.model.AppUserDrawConsume;
import org.zsy.repository.model.AppUserDrawConsumeExample;
import org.zsy.repository.model.AppUserDrawCreditRate;
import org.zsy.repository.model.AppUserDrawCreditRateExample;
import org.zsy.repository.model.AppUserDrawEdu;
import org.zsy.repository.model.AppUserDrawEduExample;
import org.zsy.repository.model.AppUserDrawExample;
import org.zsy.repository.model.AppUserDrawFamily;
import org.zsy.repository.model.AppUserDrawFamilyExample;
import org.zsy.repository.model.AppUserDrawInterest;
import org.zsy.repository.model.AppUserDrawInterestExample;
import org.zsy.repository.model.AppUserDrawMediaSource;
import org.zsy.repository.model.AppUserDrawMediaSourceExample;
import org.zsy.repository.model.AppUserDrawMediaTime;
import org.zsy.repository.model.AppUserDrawMediaTimeExample;
import org.zsy.repository.model.AppUserDrawPlatform;
import org.zsy.repository.model.AppUserDrawPlatformExample;
import org.zsy.repository.model.AppUserDrawRegion;
import org.zsy.repository.model.AppUserDrawRegionExample;
import org.zsy.repository.model.AppUserDrawRegionRate;
import org.zsy.repository.model.AppUserDrawRegionRateExample;
import org.zsy.repository.model.AppUserDrawSystem;
import org.zsy.repository.model.AppUserDrawSystemExample;
import org.zsy.repository.model.AppUserDrawType;
import org.zsy.repository.model.AppUserDrawTypeExample;
import org.zsy.repository.model.AppUserDrawWorth;
import org.zsy.repository.model.AppUserDrawWorthExample;
import org.zsy.repository.model.DmpCodeRegion;
import org.zsy.repository.model.DmpCodeRegionExample;
import org.zsy.repository.model.DmpTagDimension;
import org.zsy.repository.model.DmpTagDimensionExample;
import org.zsy.utils.DBTools;

/**
 * @author 张世一
 * @version 1.0
 */
public class MakeTestData {

    static SqlSession session = DBTools.getSqlSession();

    public static void main(String[] args) throws Exception {
//        insertUserDraw();
//        insertAppData();

    }


    public static void insertAppData() throws Exception {
        AppStatisticsDayMapper appStatisticsDayMapper = session.getMapper(AppStatisticsDayMapper.class);
        appStatisticsDayMapper.deleteByExample(new AppStatisticsDayExample());

        AppStatisticsMonthMapper appStatisticsMonthMapper = session.getMapper(AppStatisticsMonthMapper.class);
        appStatisticsMonthMapper.deleteByExample(new AppStatisticsMonthExample());

        AppInfoMapper appInfoMapper = session.getMapper(AppInfoMapper.class);
        AppInfoExample appInfoExample = new AppInfoExample();
        appInfoExample.createCriteria().andIsUsedEqualTo(1);
        List<AppInfo> appInfos = appInfoMapper.selectByExample(appInfoExample);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.DAY_OF_YEAR, 1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0; i < 6; i++,cal.add(Calendar.MONTH, 1)) {
            for (AppInfo appInfo : appInfos) {
                AppStatisticsMonth appStatisticsMonth = new AppStatisticsMonth();
                appStatisticsMonth.setId(appInfo.getId());
                appStatisticsMonth.setGetTime(cal.getTime());
                appStatisticsMonth.setPv(getRandom(654955020, 272906863).longValue());
                appStatisticsMonth.setUv(getRandom(363863900, 1262726035).intValue());
                appStatisticsMonthMapper.insertSelective(appStatisticsMonth);

                int actualMaximum = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
                cal.set(Calendar.DAY_OF_MONTH, 1);
                System.out.println("==>"+simpleDateFormat.format(cal.getTime()));

                for (int j = 0; j < actualMaximum; j++,cal.add(Calendar.DATE, 1)) {
                    AppStatisticsDay appStatisticsDay = new AppStatisticsDay();
                    appStatisticsDay.setId(appInfo.getId());
                    appStatisticsDay.setGetTime(cal.getTime());
                    appStatisticsDay.setPv(getRandom(184897415, 784897415).intValue());
                    appStatisticsDay.setUv(getRandom(84897415, 284897415).intValue());
                    appStatisticsDayMapper.insertSelective(appStatisticsDay);
                    System.out.println(simpleDateFormat.format(cal.getTime()));
                }
                cal.add(Calendar.DATE, -1);
                System.out.println("<=="+simpleDateFormat.format(cal.getTime()));
                session.commit();
            }
        }
    }


    private static void insertUserDraw() throws Exception {
        AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
        appUserDrawMapper.deleteByExample(new AppUserDrawExample());

        AppUserDrawFamilyMapper appUserDrawFamilyMapper = session.getMapper(AppUserDrawFamilyMapper.class);
        appUserDrawFamilyMapper.deleteByExample(new AppUserDrawFamilyExample());

//        AppInfoCompetitorMapper appInfoCompetitorMapper = session.getMapper(AppInfoCompetitorMapper.class);
//        appInfoCompetitorMapper.deleteByExample(new AppInfoCompetitorExample());

        AppUserDrawEduMapper appUserDrawEduMapper = session.getMapper(AppUserDrawEduMapper.class);
        appUserDrawEduMapper.deleteByExample(new AppUserDrawEduExample());

        AppUserDrawAnnualPayMapper appUserDrawAnnualPayMapper = session.getMapper(AppUserDrawAnnualPayMapper.class);
        appUserDrawAnnualPayMapper.deleteByExample(new AppUserDrawAnnualPayExample());

        AppUserDrawPlatformMapper appUserDrawPlatformMapper = session.getMapper(AppUserDrawPlatformMapper.class);
        appUserDrawPlatformMapper.deleteByExample(new AppUserDrawPlatformExample());

        AppUserDrawSystemMapper appUserDrawSystemMapper = session.getMapper(AppUserDrawSystemMapper.class);
        appUserDrawSystemMapper.deleteByExample(new AppUserDrawSystemExample());

        AppUserDrawWorthMapper appUserDrawWorthMapper = session.getMapper(AppUserDrawWorthMapper.class);
        appUserDrawWorthMapper.deleteByExample(new AppUserDrawWorthExample());

        AppUserDrawBrandRateMapper appUserDrawBrandRateMapper = session.getMapper(AppUserDrawBrandRateMapper.class);
        appUserDrawBrandRateMapper.deleteByExample(new AppUserDrawBrandRateExample());

        AppUserDrawConsumeMapper appUserDrawConsumeMapper = session.getMapper(AppUserDrawConsumeMapper.class);
        appUserDrawConsumeMapper.deleteByExample(new AppUserDrawConsumeExample());

        AppUserDrawInterestMapper appUserDrawInterestMapper = session.getMapper(AppUserDrawInterestMapper.class);
        appUserDrawInterestMapper.deleteByExample(new AppUserDrawInterestExample());

        AppUserDrawCreditRateMapper appUserDrawCreditRateMapper = session.getMapper(AppUserDrawCreditRateMapper.class);
        appUserDrawCreditRateMapper.deleteByExample(new AppUserDrawCreditRateExample());

        AppUserDrawRegionRateMapper appUserDrawRegionRateMapper = session.getMapper(AppUserDrawRegionRateMapper.class);
        appUserDrawRegionRateMapper.deleteByExample(new AppUserDrawRegionRateExample());

        AppUserDrawBusinessMapper appUserDrawBusinessMapper = session.getMapper(AppUserDrawBusinessMapper.class);
        appUserDrawBusinessMapper.deleteByExample(new AppUserDrawBusinessExample());

        AppUserDrawCityLevelMapper appUserDrawCityLevelMapper = session.getMapper(AppUserDrawCityLevelMapper.class);
        appUserDrawCityLevelMapper.deleteByExample(new AppUserDrawCityLevelExample());

        AppUserDrawTypeMapper appUserDrawTypeMapper = session.getMapper(AppUserDrawTypeMapper.class);
        appUserDrawTypeMapper.deleteByExample(new AppUserDrawTypeExample());

        AppUserDrawAppPreferencesMapper appUserDrawAppPreferencesMapper = session
            .getMapper(AppUserDrawAppPreferencesMapper.class);
        appUserDrawAppPreferencesMapper.deleteByExample(new AppUserDrawAppPreferencesExample());

        AppUserDrawMediaTimeMapper appUserDrawMediaTimeMapper = session.getMapper(AppUserDrawMediaTimeMapper.class);
        appUserDrawMediaTimeMapper.deleteByExample(new AppUserDrawMediaTimeExample());

        AppUserDrawMediaSourceMapper appUserDrawMediaSourceMapper = session
            .getMapper(AppUserDrawMediaSourceMapper.class);
        appUserDrawMediaSourceMapper.deleteByExample(new AppUserDrawMediaSourceExample());

        AppInfoMapper appInfoMapper = session.getMapper(AppInfoMapper.class);
        List<AppInfo> appInfos = appInfoMapper.selectByExample(new AppInfoExample());

        Map<String, List<AppInfo>> catMap = appInfos.stream().collect(Collectors.groupingBy(AppInfo::getCat));
        for (Entry<String, List<AppInfo>> apps : catMap.entrySet()) {
//            insertAppInfoCompetitor(apps.getValue());

            insertAppSexAge(apps.getValue());
            insertAppFamily(apps.getValue());
            insertAppEdu(apps.getValue());
            insertAppAnnualPay(apps.getValue());
            insertAppPlatform(apps.getValue());
            insertAppSystem(apps.getValue());
            insertAppWorth(apps.getValue());
            insertAppBrandRate(apps.getValue());
            insertAppInterest(apps.getValue());
            insertAppConsume(apps.getValue());
            insertAppAppCreditRate(apps.getValue());
            insertAppUserDrawBusiness(apps.getValue());
            insertAppUserDrawCityLevel(apps.getValue());
            insertAppUserDrawType(apps.getValue());
            insertAppUserDrawAppPreferences(apps.getValue());
            insertAppUserDrawMediaTime(apps.getValue());
            insertAppAppRegionRate(apps.getValue());
            insertAppUserDrawMediaSource(apps.getValue(), appInfos);
        }
        session.commit();
    }

    private static void insertAppUserDrawMediaSource(List<AppInfo> apps, List<AppInfo> appInfos) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);
            for (AppInfo appt : appInfos.subList(0, getRandom(5, 10).intValue())) {
                if (!appt.getId().equals(app.getId())) {
                    AppUserDrawMediaSourceMapper mapper = session.getMapper(AppUserDrawMediaSourceMapper.class);
                    AppUserDrawMediaSource model = new AppUserDrawMediaSource();
                    model.setId(UUID.randomUUID().toString().replace("-", ""));
                    model.setDrawId(appUserDraws.get(0).getId());
                    model.setVal(getRandom(0, 1));
                    model.setsChannelId(app.getId());
                    model.setwChannelId(appt.getId());
                    mapper.insertSelective(model);
                }
            }
        }
        System.out.println("insertAppUserDrawMediaSource");
    }

    private static void insertAppUserDrawMediaTime(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A9000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawMediaTimeMapper mapper = session.getMapper(AppUserDrawMediaTimeMapper.class);
                AppUserDrawMediaTime model = new AppUserDrawMediaTime();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                model.setActiveTime(getRandom(0, 99));
                model.setPv(getRandom(0, 99).intValue());
                model.setUv(getRandom(0, 99).intValue());
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppUserDrawMediaTime");

    }

    private static void insertAppUserDrawAppPreferences(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("B6000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawAppPreferencesMapper mapper = session.getMapper(AppUserDrawAppPreferencesMapper.class);
                AppUserDrawAppPreferences model = new AppUserDrawAppPreferences();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppUserDrawAppPreferences");

    }

    private static void insertAppUserDrawType(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("B2000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawTypeMapper mapper = session.getMapper(AppUserDrawTypeMapper.class);
                AppUserDrawType model = new AppUserDrawType();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppUserDrawType");

    }

    private static void insertAppUserDrawCityLevel(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpCodeRegionMapper dmpCodeRegionMapper = session.getMapper(DmpCodeRegionMapper.class);
            DmpCodeRegionExample dmpTagDimensionExample = new DmpCodeRegionExample();
            dmpTagDimensionExample.createCriteria().andFatherNameLike("%省");

            List<DmpCodeRegion> dmpTagDimensions = dmpCodeRegionMapper.selectByExample(dmpTagDimensionExample)
                .subList(0, 10);
            for (DmpCodeRegion dmpTagDimension : dmpTagDimensions) {
                AppUserDrawCityLevelMapper mapper = session.getMapper(AppUserDrawCityLevelMapper.class);
                AppUserDrawCityLevel model = new AppUserDrawCityLevel();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppUserDrawCityLevel");

    }

    private static void insertAppUserDrawBusiness(List<AppInfo> apps) throws Exception {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("C1000");

            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);

            Date beginDate = sdf.parse("2018-04-01");
            Date endDate = sdf.parse("2019-04-01");
            Date date = beginDate;
            while (!date.equals(endDate)) {
                c.setTime(date);
                c.add(Calendar.MONTH, 1);
                date = c.getTime();
                for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                    AppUserDrawBusinessMapper mapper = session.getMapper(AppUserDrawBusinessMapper.class);
                    AppUserDrawBusiness model = new AppUserDrawBusiness();
                    model.setId(UUID.randomUUID().toString().replace("-", ""));
                    model.setCode(dmpTagDimension.getId());
                    model.setDrawId(appUserDraws.get(0).getId());
                    model.setGrow(getRandom(0, 99));
                    model.setDataTime(sdf.format(date));
                    mapper.insertSelective(model);
                }
            }
        }
        System.out.println("insertAppUserDrawBusiness");

    }

    private static void insertAppAppRegionRate(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpCodeRegionMapper dmpCodeRegionMapper = session.getMapper(DmpCodeRegionMapper.class);
            DmpCodeRegionExample dmpTagDimensionExample = new DmpCodeRegionExample();
            dmpTagDimensionExample.createCriteria().andFatherNameEqualTo("中国大陆");

            List<DmpCodeRegion> dmpTagDimensions = dmpCodeRegionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpCodeRegion dmpTagDimension : dmpTagDimensions) {
                AppUserDrawRegionRateMapper mapper = session.getMapper(AppUserDrawRegionRateMapper.class);
                AppUserDrawRegionRate model = new AppUserDrawRegionRate();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                model.setType("1");
                mapper.insertSelective(model);

                dmpTagDimensionExample.createCriteria().andFatherNameEqualTo(dmpTagDimension.getName());
                List<DmpCodeRegion> dmpTagDimensionsTmp = dmpCodeRegionMapper.selectByExample(dmpTagDimensionExample)
                    .subList(0, 20);
                for (DmpCodeRegion dmpTagDimensiont : dmpTagDimensionsTmp) {
                    AppUserDrawRegionRateMapper mappert = session.getMapper(AppUserDrawRegionRateMapper.class);
                    AppUserDrawRegionRate modelt = new AppUserDrawRegionRate();
                    modelt.setId(UUID.randomUUID().toString().replace("-", ""));
                    modelt.setCode(dmpTagDimensiont.getId());
                    modelt.setDrawId(appUserDraws.get(0).getId());
                    modelt.setGrow(getRandom(0, 99));
                    modelt.setType("2");
                    mappert.insertSelective(modelt);
                }
            }
        }
        System.out.println("insertAppAppRegionRate");

    }

    private static void insertAppAppCreditRate(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A7000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawCreditRateMapper mapper = session.getMapper(AppUserDrawCreditRateMapper.class);
                AppUserDrawCreditRate model = new AppUserDrawCreditRate();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppAppCreditRate");

    }

    private static void insertAppInterest(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A8000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawInterestMapper mapper = session.getMapper(AppUserDrawInterestMapper.class);
                AppUserDrawInterest model = new AppUserDrawInterest();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppInterest");

    }

    private static void insertAppConsume(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A6000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawConsumeMapper mapper = session.getMapper(AppUserDrawConsumeMapper.class);
                AppUserDrawConsume model = new AppUserDrawConsume();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppConsume");

    }

    private static void insertAppBrandRate(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("B8000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawBrandRateMapper mapper = session.getMapper(AppUserDrawBrandRateMapper.class);
                AppUserDrawBrandRate model = new AppUserDrawBrandRate();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppBrandRate");

    }

    private static void insertAppWorth(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("B9000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawWorthMapper mapper = session.getMapper(AppUserDrawWorthMapper.class);
                AppUserDrawWorth model = new AppUserDrawWorth();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppWorth");

    }

    private static void insertAppSystem(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("B5000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawSystemMapper mapper = session.getMapper(AppUserDrawSystemMapper.class);
                AppUserDrawSystem model = new AppUserDrawSystem();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppSystem");

    }

    private static void insertAppPlatform(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("B4000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawPlatformMapper mapper = session.getMapper(AppUserDrawPlatformMapper.class);
                AppUserDrawPlatform model = new AppUserDrawPlatform();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppPlatform");

    }

    private static void insertAppAnnualPay(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A4000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawAnnualPayMapper mapper = session.getMapper(AppUserDrawAnnualPayMapper.class);
                AppUserDrawAnnualPay model = new AppUserDrawAnnualPay();
                model.setId(UUID.randomUUID().toString().replace("-", ""));
                model.setCode(dmpTagDimension.getId());
                model.setDrawId(appUserDraws.get(0).getId());
                model.setGrow(getRandom(0, 99));
                mapper.insertSelective(model);
            }
        }
        System.out.println("insertAppAnnualPay");

    }

    private static void insertAppEdu(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);

            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A3000");

            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawEduMapper mapper = session.getMapper(AppUserDrawEduMapper.class);
                AppUserDrawEdu appUserDrawEdu = new AppUserDrawEdu();
                appUserDrawEdu.setId(UUID.randomUUID().toString().replace("-", ""));
                appUserDrawEdu.setCode(dmpTagDimension.getId());
                appUserDrawEdu.setDrawId(appUserDraws.get(0).getId());
                appUserDrawEdu.setGrow(getRandom(0, 99));
                mapper.insertSelective(appUserDrawEdu);
            }
        }
        System.out.println("insertAppEdu");

    }

    private static void insertAppFamily(List<AppInfo> apps) {
        for (AppInfo app : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            AppUserDrawExample appUserDrawExample = new AppUserDrawExample();
            appUserDrawExample.createCriteria().andAppIdEqualTo(app.getId());
            List<AppUserDraw> appUserDraws = appUserDrawMapper.selectByExample(appUserDrawExample);
            DmpTagDimensionMapper dmpTagDimensionMapper = session.getMapper(DmpTagDimensionMapper.class);
            DmpTagDimensionExample dmpTagDimensionExample = new DmpTagDimensionExample();
            dmpTagDimensionExample.createCriteria().andFatherIdEqualTo("A5000");
            List<DmpTagDimension> dmpTagDimensions = dmpTagDimensionMapper.selectByExample(dmpTagDimensionExample);
            for (DmpTagDimension dmpTagDimension : dmpTagDimensions) {
                AppUserDrawFamilyMapper appUserDrawFamilyMapper = session.getMapper(AppUserDrawFamilyMapper.class);
                AppUserDrawFamily appUserDrawFamily = new AppUserDrawFamily();
                appUserDrawFamily.setId(UUID.randomUUID().toString().replace("-", ""));
                appUserDrawFamily.setCode(dmpTagDimension.getId());
                appUserDrawFamily.setDrawId(appUserDraws.get(0).getId());
                appUserDrawFamily.setGrow(getRandom(0, 99));
                appUserDrawFamilyMapper.insertSelective(appUserDrawFamily);
            }
        }
        System.out.println("insertAppFamily");

    }

    private static void insertAppSexAge(List<AppInfo> apps) {
        AppUserDraw appUserDraw = null;
        for (AppInfo appInfo : apps) {
            AppUserDrawMapper appUserDrawMapper = session.getMapper(AppUserDrawMapper.class);
            appUserDraw = new AppUserDraw();
            appUserDraw.setAppId(appInfo.getId());
            appUserDraw.setGetTime(new Date(System.currentTimeMillis()));
            appUserDraw.setId(UUID.randomUUID().toString().replace("-", ""));
            appUserDraw.setMr(getRandom(0, 99));
            appUserDraw.setMs(getRandom(0, 99));
            appUserDraw.setAge1(getRandom(0, 30));
            appUserDraw.setAge2(getRandom(30, 99));
            appUserDraw.setAge3(getRandom(60, 99));
            appUserDraw.setAge4(getRandom(30, 99));
            appUserDraw.setAge5(getRandom(0, 30));
            appUserDraw.setAge6(getRandom(0, 10));
            appUserDrawMapper.insertSelective(appUserDraw);
        }
        System.out.println("insertAppSexAge");

    }

    private static void insertAppInfoCompetitor(List<AppInfo> apps) {
        AppInfoCompetitor appInfoCompetitor = null;
        for (AppInfo appInfo : apps) {
            for (AppInfo app : apps) {
                if (!appInfo.getId().equals(app.getId())) {
                    AppInfoCompetitorMapper appInfoCompetitorMapper = session.getMapper(AppInfoCompetitorMapper.class);
                    appInfoCompetitor = new AppInfoCompetitor();
                    appInfoCompetitor.setAppId(appInfo.getId());
                    appInfoCompetitor.setCompetitorId(app.getId());
                    appInfoCompetitor.setGrow(getRandom(0, 99).doubleValue());
                    appInfoCompetitorMapper.insertSelective(appInfoCompetitor);
                }
            }
        }
        System.out.println("insertAppInfoCompetitor");
    }


    private static BigDecimal getRandom(int min, int max) {
        return new BigDecimal(new Random().nextDouble())
            .add(new BigDecimal(new Random().nextInt(max) % (max - min + 1) + min));
    }
}
