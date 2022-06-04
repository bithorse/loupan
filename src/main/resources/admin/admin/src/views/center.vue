<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='tanzhu'"  label="摊主账号" prop="tanzhuzhanghao">
          <el-input v-model="ruleForm.tanzhuzhanghao" readonly              placeholder="摊主账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='tanzhu'"  label="摊主姓名" prop="tanzhuxingming">
          <el-input v-model="ruleForm.tanzhuxingming"               placeholder="摊主姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='tanzhu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in tanzhuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='tanzhu'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='tanzhu'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="tanzhutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='tanzhu'"  label="摊主手机" prop="tanzhushouji">
          <el-input v-model="ruleForm.tanzhushouji"               placeholder="摊主手机" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='shichangguanliyuan'"  label="管理账号" prop="guanlizhanghao">
          <el-input v-model="ruleForm.guanlizhanghao" readonly              placeholder="管理账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='shichangguanliyuan'"  label="管理姓名" prop="guanlixingming">
          <el-input v-model="ruleForm.guanlixingming"               placeholder="管理姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='shichangguanliyuan'"  label="备注" prop="beizhu">
          <el-input v-model="ruleForm.beizhu"               placeholder="备注" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='shichangguanliyuan'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="shichangguanliyuantouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='shichangguanliyuan'"  label="管理电话" prop="guanlidianhua">
          <el-input v-model="ruleForm.guanlidianhua"               placeholder="管理电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='shichangguanliyuan'"  label="街道区域" prop="jiedaoquyu">
          <el-select v-model="ruleForm.jiedaoquyu" :disabled="true" placeholder="请选择街道区域">
            <el-option
                v-for="(item,index) in shichangguanliyuanjiedaoquyuOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      tanzhuxingbieOptions: [],
      shichangguanliyuanjiedaoquyuOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.tanzhuxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/jiedaoquyu/jiedaoquyu`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.shichangguanliyuanjiedaoquyuOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    tanzhutouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    shichangguanliyuantouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.tanzhuzhanghao)&& 'tanzhu'==this.flag){
        this.$message.error('摊主账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'tanzhu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'tanzhu' ==this.flag && this.ruleForm.tanzhushouji&&(!isMobile(this.ruleForm.tanzhushouji))){
        this.$message.error(`摊主手机应输入手机格式`);
        return
      }
      if((!this.ruleForm.guanlizhanghao)&& 'shichangguanliyuan'==this.flag){
        this.$message.error('管理账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'shichangguanliyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'shichangguanliyuan' ==this.flag && this.ruleForm.guanlidianhua&&(!isMobile(this.ruleForm.guanlidianhua))){
        this.$message.error(`管理电话应输入手机格式`);
        return
      }
      if((!this.ruleForm.jiedaoquyu)&& 'shichangguanliyuan'==this.flag){
        this.$message.error('街道区域不能为空');
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
